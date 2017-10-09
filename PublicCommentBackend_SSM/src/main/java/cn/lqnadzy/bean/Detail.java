package cn.lqnadzy.bean;

public class Detail {
	private String img;
    private String title;
    private int star;
    private String price;
    private String subTitle;
    private String desc;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Detail [img=" + img + ", title=" + title + ", star=" + star + ", price=" + price + ", subTitle="
				+ subTitle + ", desc=" + desc + "]";
	}
    
}
