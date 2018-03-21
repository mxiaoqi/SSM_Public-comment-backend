package cn.lqandzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lqandzy.bean.Dic;
import cn.lqandzy.dao.DicDao;
import cn.lqandzy.service.DicService;

/** 
* 
* @author : 慕祈
* @date 创建时间：2018年3月21日 下午9:40:23 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
@Service("dicService")
public class DicServiceImpl implements DicService {
	@Autowired 
	private DicDao dicDao;
	
	@Override
	public List<Dic> listDics(Dic dic) {
		List<Dic> select = dicDao.listDics(dic);
		return select;
	}

}
