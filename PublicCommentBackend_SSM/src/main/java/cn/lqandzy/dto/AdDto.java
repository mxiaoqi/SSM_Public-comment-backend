package cn.lqandzy.dto;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.lqandzy.bean.Ad;
/**
 * 
 * @author Administrator
 * 
 */
//忽略没有的数据
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
		return "AdDto [img=" + img + ", imgFile=" + imgFile + ", getWeight()=" + getWeight() + ", getTitle()="
				+ getTitle() + ", getImgFileName()=" + getImg() + ", getLink()=" + getLink() + ", toString()="
				+ super.toString() + "]";
	}

}
