package cn.lqandzy.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.lqandzy.bean.Orders;
import cn.lqandzy.constant.CommentStateConst;
import cn.lqandzy.dao.OrdersDao;
import cn.lqandzy.dto.OrdersDto;
import cn.lqandzy.service.OrdersService;

/** 
* 
* @author : 慕祈
* @date 创建时间：2018年4月25日 下午9:31:25 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersDao ordersDao;
	
	@Value("${businessImage.url}")
    private String businessImageUrl;
	
	@Override
	public List<OrdersDto> getListByMemberId(Long memberId) {
		List<OrdersDto> result = new ArrayList<OrdersDto>();;
		try {
			List<Orders> listOrdersByMemberId = ordersDao.listOrdersByMemberId(memberId);
			
			for (Orders orders : listOrdersByMemberId) {
				OrdersDto ordersDto = new OrdersDto();
				BeanUtils.copyProperties(orders, ordersDto);
				result.add(ordersDto);
				ordersDto.setImg(businessImageUrl + orders.getBusiness().getImgFileName());
				ordersDto.setTitle(orders.getBusiness().getTitle());
				ordersDto.setCount(orders.getBusiness().getNumber());
			}
		} catch (BeansException e) {
			//TODO 调用日志通用方法
			e.printStackTrace();
		}
		
		return result;
	}

	
	
	@Override
	public OrdersDto getOrdersDtoById(Long id) {
		try {
			OrdersDto result = new OrdersDto();
			Orders orders = ordersDao.selectById(id);
			BeanUtils.copyProperties(orders, result);
			return result;
		} catch (BeansException e) {
			//TODO 调用日志通用方法
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean add(OrdersDto ordersDto) {
		int insert;
		try {
			Orders orders = new Orders();
			BeanUtils.copyProperties(ordersDto, orders);
			orders.setCommentState(CommentStateConst.NOT_COMMENT);
			insert = ordersDao.insert(orders);
			if(insert>0){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			//TODO 调用日志通用方法
			e.printStackTrace();
			return false;
		}
	}

}
