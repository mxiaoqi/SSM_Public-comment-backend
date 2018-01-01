package cn.lqandzy.constant;
/**
 * 
 * @author Administrator
 * 
 */
public enum PageCodeEnum {
	/**
	 * 新增成功
	 */
	ADD_SUCCESS(1000,"新增成功"),
	/**
	 * 新增失败
	 */
	ADD_FAIL(1001,"新增失败");
	
	
	
	private Integer code;
	private String msg;
	public static final String KEY="pageCode";
	
	
	
	private PageCodeEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public static String getKey() {
		return KEY;
	}
	
	
	
	
}
