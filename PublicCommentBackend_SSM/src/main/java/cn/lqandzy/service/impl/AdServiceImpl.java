package cn.lqandzy.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.lqandzy.bean.Ad;
import cn.lqandzy.dto.AdDto;
import cn.lqandzy.mapper.AdMapper;
import cn.lqandzy.service.AdService;

/**
 * 
 * @author Administrator
 *
 */
@Service
public class AdServiceImpl implements AdService {
	@Autowired
	private AdMapper adMapper;

	@Value("${adImage.savePath}")
	private String adImageSavePath;

	@Value("${adImage.url}")
	private String adImageUrl;

	
	@Override
	// TODO 后面可以改成失败的原因
	public boolean addAd(AdDto adDto) throws Exception {
		//数据库对应的广告bean
		Ad ad = new Ad();
		
		if (adDto.getImgFile() != null && adDto.getImgFile().getSize()>0) {
			
			
			/************** 保存图片业务 ************/
			String imgFileName = System.currentTimeMillis() + "_" + adDto.getImgFile().getOriginalFilename();
			// 保存的文件
			File file = new File(adImageSavePath + imgFileName);
			File fileFolder = new File(adImageSavePath);
			// 保存路径不存在
			if (!fileFolder.exists()) {
				//多级文件一并创建
				fileFolder.mkdirs();
			}

			
			/************** 保存图片业务 ************/
			try {
				// 保存图片到磁盘
				adDto.getImgFile().transferTo(file);
				BeanUtils.copyProperties(adDto, ad);
				ad.setImgFileName(imgFileName);
			} catch (Exception e) {
				// TODO 以后可以添加日志的功能
				return false;
			}
			
			
			/************** 保存广告业务 *************/
			adMapper.insert(adDto);
			/************** 保存广告业务 *************/
			return true;
		} else {
			return false;
		}

	}

	@Override
	public List<AdDto> searchByPage(AdDto adDto) {
		List<AdDto> result = new ArrayList<AdDto>();
		Ad condition = new Ad();
		BeanUtils.copyProperties(adDto, condition);
		List<Ad> adList = adMapper.selectByPage(condition);
		for (Ad ad : adList) {
			AdDto adDtoTemp = new AdDto();
			result.add(adDtoTemp);
			adDtoTemp.setImg(adImageUrl + ad.getImgFileName());
			BeanUtils.copyProperties(ad, adDtoTemp);
		}
		return result;
	}

}
