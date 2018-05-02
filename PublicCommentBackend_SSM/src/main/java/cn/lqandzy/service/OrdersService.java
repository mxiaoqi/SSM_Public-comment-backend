package cn.lqandzy.service;

import java.util.List;

import cn.lqandzy.dto.OrdersDto;

/** 
* 订单相关的业务逻辑层
* @author : 慕祈
* @date 创建时间：2018年4月25日 下午8:42:19 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public interface OrdersService {

	/**
	 * 用户相关的订单列表
	 * @param memberId 用户的id
	 * @return 用户下的订单列表(dto封装过一次)
	 */
	List<OrdersDto> getListByMemberId(Long memberId);

	/**
	 * 返回订单的dto数据
	 * @param id 订单的id
	 * @return
	 */
	OrdersDto getOrdersDtoById(Long id);
	
	/**
	 * 添加订单
	 * @param ordersDto 订单数据
	 * @return true 添加成功  false添加失败
	 */
	boolean add(OrdersDto ordersDto);
	
	
	
}	
