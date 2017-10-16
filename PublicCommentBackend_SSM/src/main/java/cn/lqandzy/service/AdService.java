package cn.lqandzy.service;

import java.util.List;

import cn.lqandzy.dto.AdDto;
/**
 * 
 * @author Administrator
 *
 */
public interface AdService {
	/**
	 * 添加广告逻辑
	 * @param adDto
	 * @return boolean
	 * @author Administrator
	 * @throws Exception
	 * @Exception 上抛异常
	 */
	public boolean addAd(AdDto adDto) throws Exception;
	
	/**
     * 分页搜索广告列表
     * @param adDto 查询条件(包含分页对象)
     * @author Administrator
     * @return 广告列表
     * @throws Exception
     * @Exception 上抛异常
     */
    List<AdDto> searchByPage(AdDto adDto) throws Exception;
}
