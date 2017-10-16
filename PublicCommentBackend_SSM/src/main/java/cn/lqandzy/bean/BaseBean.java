package cn.lqandzy.bean;

/**
 * 
 * @author Administrator
 * 
 */
public class BaseBean {
	
	private Page page;
	
	public BaseBean() {
	    this.page = new Page();
	}
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
}