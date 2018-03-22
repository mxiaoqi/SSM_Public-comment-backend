package cn.lqandzy.bean;
/** 
* 
* @author : 慕祈
* @date 创建时间：2018年3月19日 下午7:57:37 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class Business extends BaseBean{
	private Long id;
	private String imgFileName;
	private String title;
	private String subtitle;
	private Double price;
	/**
	 * 距离
	 */
	private Integer distance;
	/**
	 * 已售数量
	 */
    private Integer number;
    /**
     * 描述
     */
    private String desc;
    /**
     * 关联字典表的城市编码(code)
     */
    private String city;
    /**
     * 类别
     */
    private String category;
    /**
     * 星星总数
     */
    private Long starTotalNum;
    /**
     * 评论总数
     */
    private Long commentTotalNum;
    
    /**
     * 城市字典
     */
    private Dic cityDic;
    
    /**
     * 类别字典
     */
    private Dic categoryDic;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImgFileName() {
		return imgFileName;
	}
	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getStarTotalNum() {
		return starTotalNum;
	}
	public void setStarTotalNum(Long starTotalNum) {
		this.starTotalNum = starTotalNum;
	}
	public Long getCommentTotalNum() {
		return commentTotalNum;
	}
	public void setCommentTotalNum(Long commentTotalNum) {
		this.commentTotalNum = commentTotalNum;
	}
	public Dic getCityDic() {
		return cityDic;
	}
	public void setCityDic(Dic cityDic) {
		this.cityDic = cityDic;
	}
	public Dic getCategoryDic() {
		return categoryDic;
	}
	public void setCategoryDic(Dic categoryDic) {
		this.categoryDic = categoryDic;
	}
	@Override
	public String toString() {
		return "Business [id=" + id + ", imgFileName=" + imgFileName + ", title=" + title + ", subtitle=" + subtitle
				+ ", price=" + price + ", distance=" + distance + ", number=" + number + ", desc=" + desc + ", city="
				+ city + ", category=" + category + ", starTotalNum=" + starTotalNum + ", commentTotalNum="
				+ commentTotalNum + "]";
	}
    
}
