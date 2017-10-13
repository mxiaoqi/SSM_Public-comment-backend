package cn.lqandzy.dto;

import org.springframework.web.multipart.MultipartFile;

import cn.lqandzy.bean.Ad;

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
				+ getTitle() + ", getImgFileName()=" + getImgFileName() + ", getLink()=" + getLink() + ", toString()="
				+ super.toString() + "]";
	}

}
