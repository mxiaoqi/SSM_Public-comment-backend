package cn.lqandzy.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import cn.lqandzy.bean.Business;
import cn.lqandzy.dao.BusinessDao;
import cn.lqandzy.dto.BusinessDto;
import cn.lqandzy.service.BusinessService;

/** 
* 
* @author : 慕祈
* @date 创建时间：2018年3月21日 下午8:34:25 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
@Service("businessService")
public class BusinessServiceImpl implements BusinessService{
	@Autowired
	private BusinessDao businessDao;
	
	//商户图片储存路径
	@Value("${businessImage.savePath}")
	private String businessImageSavePath;
	
	//商户图片访问路径
	@Value("${businessImage.url}")
	private String businessImageUrl;
	
	private static Logger logger = LoggerFactory.getLogger(BusinessServiceImpl.class);  
	@Override
	public List<BusinessDto> listBusinesses(BusinessDto businessDto) {
		List<BusinessDto> businessDtos=new ArrayList<BusinessDto>();
		//查询条件
		Business condition= new Business();
		
		BeanUtils.copyProperties(businessDto, condition);
		
		List<Business> selectLikeByPage = businessDao.selectByPage(condition);
		
		for (Business business : selectLikeByPage) {
			BusinessDto businessDtoTemp=new BusinessDto();
			
			//设置图片
			businessDtoTemp.setImg(businessImageUrl+business.getImgFileName());
			//设置其他属性
			BeanUtils.copyProperties(business, businessDtoTemp);
			
			businessDtos.add(businessDtoTemp);
		}
		return businessDtos;
	}

	@Override
	public boolean insert(BusinessDto businessDto) {
		Business business=new Business(); 
		//有上传文件，文件不为空
		if(businessDto.getImgFile()!=null && businessDto.getImgFile().getSize()>0){
			/************** 保存图片业务 ************/
			//重写图片文件名（防止图片重名。规则:毫秒级时间+_+文件原名）
			String imgFileName = System.currentTimeMillis() + "_" + businessDto.getImgFile().getOriginalFilename();
			// 保存的文件(保存路径+文件名称)
			File file = new File(businessImageSavePath + imgFileName);
			//保存路径
			File fileFolder = new File(businessImageSavePath);
			// 如果保存路径不存在
			if (!fileFolder.exists()) {
				//多级文件一并创建
				fileFolder.mkdirs();
			}
			try {
				// 保存图片到磁盘
				businessDto.getImgFile().transferTo(file);
				//spring的对象赋值类
				BeanUtils.copyProperties(businessDto, business);
				business.setImgFileName(imgFileName);
			} catch (Exception e) {
				logger.error("广告模块addAd发生错误"+e);
				return false;
			}
			//保存商户信息
			businessDao.insert(business);
			return true;
		}else{
			//文件为空就不允许保存
			return false;
		}
	}

}
