package cn.lqandzy.bean;
/**
 * 字典表
 * @author : 慕祈
 * @date 创建时间：2018年3月16日 下午7:04:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return 
 */
public class Dic {
	/**
	 * 类别
	 */
    private String type;
    /**
	 * 编码
	 */
    private String code;
    /**
	 * 名称
	 */
    private String name;
    /**
	 * 权重
	 */
    private Integer weight;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}