package cn.lqandzy.bean;
/** 
* 
* @author : 慕祈
* @date 创建时间：2018年3月16日 下午7:04:40 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class BaseBean {
	private Page page;

	/**
	 * 初始化page对象,让page对象不为空
	 * @param page
	 */
	public BaseBean() {
		page = new Page();
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "BaseBean [page=" + page + "]";
	}
	
}	
