package cn.lqandzy.dao;

import java.util.List;
import cn.lqandzy.bean.Orders;

/** 
* 
* @author : 慕祈
* @date 创建时间：2018年4月24日 下午10:22:11 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public interface OrdersDao {
	/**
	 * 新增一个订单
	 * @param orders
	 * @return
	 */
	int insert(Orders orders);
	
	/**
	 * 根据订单id查询订单
	 * @param id
	 * @return
	 */
	Orders selectById(Long id);
	
	/**
	 * 根据用户的id查询下的订单组
	 * @param memberId
	 * @return
	 */
	List<Orders> listOrdersByMemberId(Long memberId);
	
	/**
	 * 修改
	 * @param orders 订单表对象
	 * @return 影响行数
	 */
	int update(Orders orders);
}	
