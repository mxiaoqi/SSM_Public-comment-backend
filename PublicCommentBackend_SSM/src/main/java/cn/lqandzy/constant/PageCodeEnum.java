package cn.lqandzy.constant;

/**
 * 通用页面信息枚举
 * @author 慕祈
 * 
 */
public enum PageCodeEnum {
	//商品添加成功信息
	ADD_SUCCESS(1000,"新增成功"),
	
	//商品添加失败信息
	ADD_FAIL(1001,"新增失败"),
	
	//商品修改成功信息
	MODIFY_SUCCESS(1100,"修改成功！"),
	
	//商品修改失败信息
    MODIFY_FAIL(1101,"修改失败！"),
    
    //商品删除成功信息
    REMOVE_SUCCESS(1200,"删除成功！"),
    
    //商品删除成功信息
    REMOVE_FAIL(1201,"删除失败！");
	
	
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
}
