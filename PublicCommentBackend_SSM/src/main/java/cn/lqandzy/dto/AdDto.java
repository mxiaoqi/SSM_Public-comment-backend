package cn.lqandzy.dto;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.lqandzy.bean.Ad;

/** 
* ad类的扩展类，因为前端的需求，需要把ad类扩展（也可以是vo）
* @author : 慕祈
* @date 创建时间：2018年3月15日 下午8:05:12 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
@JsonInclude(Include.NON_NULL)
public class AdDto extends Ad{
	private String img;
	
	private MultipartFile imgFile;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	public MultipartFile getImgFile() {
		return imgFile;
	}

	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}

	@Override
	public String toString() {
		return "AdDto [img=" + img + ", imgFile=" + imgFile + "]";
	}
}
