package cn.lqandzy.bean;
/**
 * 
 * @author Administrator
 * 
 */
public class OrderList {
	
	private String id;
	private String img;
	private String title;
	private int count;
	private String price;
	private int commentState;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getCommentState() {
		return commentState;
	}
	public void setCommentState(int commentState) {
		this.commentState = commentState;
	}
	@Override
	public String toString() {
		return "OrderList [id=" + id + ", img=" + img + ", title=" + title + ", count=" + count + ", price=" + price
				+ ", commentState=" + commentState + "]";
	}
	
}
