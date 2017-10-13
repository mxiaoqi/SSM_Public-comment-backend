package cn.lqandzy.bean;

import java.util.List;

public class CommentList {
	private boolean hasMore;
	private List<Comment> data;
	public boolean isHasMore() {
		return hasMore;
	}
	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}
	public List<Comment> getData() {
		return data;
	}
	public void setData(List<Comment> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CommentList [hasMore=" + hasMore + ", data=" + data + "]";
	}
	
}
