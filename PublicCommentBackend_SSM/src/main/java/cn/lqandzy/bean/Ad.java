package cn.lqandzy.bean;
/** 
* 
* @author : 慕祈
* @date 创建时间：2018年3月15日 下午7:54:11 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class Ad {
	private Long id;
	private String title;
	private String imgFileName;
	private String link;
	private Long weight;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Ad [id=" + id + ", title=" + title + ", imgFileName=" + imgFileName + ", link=" + link + ", weight="
				+ weight + "]";
	}
}	
