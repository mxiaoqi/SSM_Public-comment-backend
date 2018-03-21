package cn.lqandzy.service;

import java.util.List;
import cn.lqandzy.dto.BusinessDto;

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
}
