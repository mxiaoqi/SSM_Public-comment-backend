package cn.lqandzy.bean;


public class Ad{
    private String title;
    private String imgFileName;
    private String link;
    private int weight;
    
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getImgFileName() {
		return imgFileName;
	}
	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Ad [title=" + title + ", imgFileName=" + imgFileName + ", link=" + link + ", weight=" + weight + "]";
	}
}