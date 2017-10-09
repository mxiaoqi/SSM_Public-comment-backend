package cn.lqnadzy.bean;


public class Business{
    private String img;
	private String title;
	private String subTitle;
	private String price;
	private String distance;
	private String mumber;
	private String id;
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
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getMumber() {
		return mumber;
	}
	public void setMumber(String mumber) {
		this.mumber = mumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Business [img=" + img + ", title=" + title + ", subTitle=" + subTitle + ", price=" + price
				+ ", distance=" + distance + ", mumber=" + mumber + ", id=" + id + "]";
	}

}