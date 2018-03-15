package cn.lqandzy.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.lqandzy.bean.Ad;
import cn.lqandzy.dao.AdDao;
import cn.lqandzy.dto.AdDto;
import cn.lqandzy.service.AdService;
import cn.lqandzy.util.FileUtil;

/**
 * 
 * @author Administrator
 *
 */
@Service
public class AdServiceImpl implements AdService {
	@Autowired
	private AdDao adDao;

	@Value("${adImage.savePath}")
	private String adImageSavePath;

	@Value("${adImage.url}")
	private String adImageUrl;

	
	@Override
	// TODO 可以改成获取失败的原因
	public boolean addAd(AdDto adDto) throws Exception {
		//数据库对应的广告bean
		Ad ad = new Ad();
		/************** 保存图片业务 ************/
		if (adDto.getImgFile() != null && adDto.getImgFile().getSize()>0) {
			//重写图片文件名（防止图片重名。规则:毫秒级时间+_+文件原名）
			String imgFileName = System.currentTimeMillis() + "_" + adDto.getImgFile().getOriginalFilename();
			// 保存的文件(保存路径+文件名称)
			File file = new File(adImageSavePath + imgFileName);
			File fileFolder = new File(adImageSavePath);
			// 如果保存路径不存在
			if (!fileFolder.exists()) {
				//多级文件一并创建
				fileFolder.mkdirs();
			}
			try {
				// 保存图片到磁盘
				adDto.getImgFile().transferTo(file);
				//spring的对象赋值类
				BeanUtils.copyProperties(adDto, ad);
				ad.setImgFileName(imgFileName);
			} catch (Exception e) {
				// TODO 以后可以添加日志的功能
				return false;
			}
		/************** 保存图片业务 ************/	
			
			//保存广告数据
			adDao.insert(ad);
			
			return true;
		} else {
			//文件为空，不允许保存
			return false;
		}

	}

	@Override
	public List<AdDto> searchByPage(AdDto adDto) {
		/*List<AdDto> result = new ArrayList<AdDto>();
		Ad condition = new Ad();
		BeanUtils.copyProperties(adDto, condition);
		List<Ad> adList = adDao.selectByPage(condition);
		for (Ad ad : adList) {
			AdDto adDtoTemp = new AdDto();
			result.add(adDtoTemp);
			adDtoTemp.setImg(adImageUrl + ad.getImgFileName());
			BeanUtils.copyProperties(ad, adDtoTemp);
		}*/
		return null;
	}

	@Override
	public int deleteAd(Long id) throws Exception {
		/*int delete=0;
		if(id!=null)
		{
			delete = adDao.delete(id);
		}*/
		return (Integer) null;
	}

	@Override
	public boolean modify(AdDto adDto) {
		return false;
		/*Ad ad = new Ad();
		
		ad=adDao.selectById(adDto.getId());
		
		String fileName = ad.getImgFileName();
		
		
		
		BeanUtils.copyProperties(adDto, ad);
		
		if (adDto.getImgFile() != null && adDto.getImgFile().getSize() > 0) {
			try {
				//保存图片
				ad.setImgFileName(FileUtil.save(adDto.getImgFile(), adImageSavePath));
			} catch (IllegalStateException | IOException e) {
				// TODO 需要添加日志
				return false;
			}
		}
		
		
		int updateCount = adDao.update(ad);
		
		if (updateCount != 1) {
			return false;
		}
		
		
		if (fileName != null) {
			return FileUtil.delete(adImageSavePath + fileName);
		}
		
		return true;*/
	}

	@Override
	public AdDto getById(Long id) {
		/*AdDto adDto=new AdDto();
		Ad ad = adDao.selectById(id);
		BeanUtils.copyProperties(ad, adDto);
		adDto.setImg(adImageUrl+ad.getImgFileName());*/
		
		return null;
	}

}
