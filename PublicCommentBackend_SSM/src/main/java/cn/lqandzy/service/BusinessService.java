package cn.lqandzy.service;

import java.util.List;

import cn.lqandzy.bean.Business;
import cn.lqandzy.dto.BusinessDto;
import cn.lqandzy.dto.BusinessListDto;

/** 
* 
* @author : 慕祈
* @date 创建时间：2018年3月21日 下午8:29:54 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public interface BusinessService {
	/**
	 * 获取所有商户列表
	 * @param business 存放查询条件
	 * @return
	 */
	List<BusinessDto> listBusinesses(BusinessDto businessDto);
	
	/**
	 * 添加商户 
	 * @param businessDto 必须包含图片文件，否则不允许保存
	 * @return
	 */
	boolean insert(BusinessDto businessDto);
	
	/**
	 * 根据id获取需要的商户
	 * @param id 商户的id
	 * @return
	 */
	BusinessDto getById(Long id);
	
	/**
	 * 修改商户模块
	 * @param businessDto
	 * @return
	 */
	boolean modify(BusinessDto businessDto);
	
	/**
	 * 删除商户模块
	 * @param id 要删除的id
	 * @return
	 */
	boolean remove(Long id);
	
	/**
	 * 前端首页商户api展示所需要的数据
	 * @param businessDto 封装了查询条件
	 * @return
	 */
	BusinessListDto searchByPageForApi(BusinessDto businessDto); 
	
}
