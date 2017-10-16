package cn.lqandzy.mapper;

import java.util.List;

import cn.lqandzy.bean.Ad;
/**
 * 
 * @author Administrator
 * 
 */
public interface AdMapper {
	/**
     * 新增
     * @param ad 广告表对象
     * @return 影响行数
     */
	public int addAd(Ad ad);
	
	/**
     * 根据查询条件分页查询
     * @param ad 查询条件：包括广告表的查询字段和分页信息
     * @return 广告列表
     */
    public List<Ad> selectByPage(Ad ad);
}
