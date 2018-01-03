package cn.lqandzy.service;

import java.util.List;

import cn.lqandzy.dto.AdDto;
/**
 * 
 * @author MuQi
 *
 */
public interface AdService {
	/**
	 * 添加广告逻辑
	 * @param adDto
	 * @return boolean
	 * @author MuQi
	 * @throws Exception
	 * @Exception 上抛异常
	 */
	public boolean addAd(AdDto adDto) throws Exception;
	
	/**
     * 分页搜索广告列表
     * @param adDto 查询条件(包含分页对象)
     * @author MuQi
     * @return 广告列表
     * @throws Exception
     * @Exception 上抛异常
     */
    List<AdDto> searchByPage(AdDto adDto) throws Exception;
    
    /**
     * 根据id删除广告
     * @param  id  广告id
     * @author MuQi
     * @return 删除的行数
     * @throws Exception
     * @Exception 上抛异常
     */
    int deleteAd(Long id) throws Exception;
    
    /**
     * 修改广告
     * @param adDto
     * @return 是否修改成功：true-成功;fale-失败
     */
    boolean modify(AdDto adDto);

	/**
     * 根据主键获取广告的Dto对象
     * @param id 广告表主键值
     * @return adDto对象
     */
    AdDto getById(Long id);
}
