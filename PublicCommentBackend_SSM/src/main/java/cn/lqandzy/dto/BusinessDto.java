package cn.lqandzy.dto;

import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import cn.lqandzy.bean.Business;

@JsonInclude(Include.NON_NULL)
public class BusinessDto extends Business{
    
    private String img;
    private MultipartFile imgFile;
    private String keyword;
    private Integer mumbers;
    private Integer star;
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
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getMumbers() {
        return mumbers;
    }
	public void setMumbers(Integer mumbers) {
		this.mumbers = mumbers;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	@Override
	public String toString() {
		return "BusinessDto [img=" + img + ", imgFile=" + imgFile + ", keyword=" + keyword + ", mumber=" + mumbers
				+ ", star=" + star + "]";
	}
    
}