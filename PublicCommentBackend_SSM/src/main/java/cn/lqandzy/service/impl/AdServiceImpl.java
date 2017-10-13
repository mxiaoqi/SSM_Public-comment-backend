package cn.lqandzy.service.impl;

import java.io.File;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import cn.lqandzy.bean.Ad;
import cn.lqandzy.dto.AdDto;
import cn.lqandzy.mapper.AdMapper;
import cn.lqandzy.service.AdService;

public class AdServiceImpl implements AdService{
	@Autowired
	private AdMapper adMapper;
	
	@Value("${adImage.savePath}")
	private String adImageSavePath;
	
	//TODO 后面可以改成失败的原因
	public boolean addAd(AdDto adDto) throws Exception {
		
		if(adDto.getImgFile()!=null)
		{
			/**************保存图片业务************/
			String imgFileName=System.currentTimeMillis()+"_"+adDto.getImgFile().getOriginalFilename();
			//保存的文件
			File file=new File(adImageSavePath+imgFileName);
			File fileFolder=new File(adImageSavePath);
			//保存路径不存在
			if(!fileFolder.exists())
			{
				fileFolder.mkdirs();
			}
			
			//保存图片到磁盘
			try {
				adDto.getImgFile().transferTo(file);
			} catch (Exception e) {
				//TODO 以后可以添加日志的功能
				e.printStackTrace();
			} 
			/**************保存图片业务************/
			
			/**************保存广告业务*************/
			Ad ad=new Ad();
			BeanUtils.copyProperties(adDto, ad);
			ad.setImgFileName(imgFileName);
			
			adMapper.addAd(ad);
			
			return true;
		}else{
			return false;
		}
		
		
		
	}
	
}
