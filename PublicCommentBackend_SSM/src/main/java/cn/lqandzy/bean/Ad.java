package cn.lqandzy.bean;


/**
 * 
 * @author 张宇
 *
 */
public class Ad extends BaseBean{
	private Long id;
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ad [id=" + id + ", title=" + title + ", imgFileName=" + imgFileName + ", link=" + link + ", weight="
				+ weight + "]";
	}
	
}