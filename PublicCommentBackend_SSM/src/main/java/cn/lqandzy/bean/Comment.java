package cn.lqandzy.bean;

public class Comment {
	  private String username;
      private String comment;
      private int star;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	@Override
	public String toString() {
		return "Comment [username=" + username + ", comment=" + comment + ", star=" + star + "]";
	}
      
      
}
