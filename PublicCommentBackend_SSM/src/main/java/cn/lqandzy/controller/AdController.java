package cn.lqandzy.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import cn.lqandzy.constant.PageCodeEnum;
import cn.lqandzy.dto.AdDto;
import cn.lqandzy.service.AdService;

/**
 * 广告控制层
 * @author muqi
 *
 */
@Controller
@RequestMapping("/ad")
public class AdController extends BaseController{
	@Autowired
	private AdService adService;
	
	/**
	 * 广告管理页初始化(点广告管理菜单进入的第一个页面)
	 * @throws Exception 
	 */
	@RequestMapping
	public String init(Model model, HttpServletRequest request) throws Exception {
		AdDto adDto = new AdDto();
		model.addAttribute("list", adService.searchByPage(adDto));
		model.addAttribute("searchParam", adDto);
		return "content/adList";
	}
	
	
	
	/**
	 * 根据参数查询广告列表数据
	 * @param model
	 * @param adDto 广告类传输对象
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/search")
	public String search(Model model,AdDto adDto) throws Exception{
		model.addAttribute("list", adService.searchByPage(adDto));
		model.addAttribute("searchParam", adDto);
		
		return "content/adList";
	}
	/**
	 * 
	 * @param id 要删除的广告id
	 * @param currentPage 当前分页的当前页数
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/remove")
	public String remove(@RequestParam("id") Long id,@RequestParam("page.currentPage")Integer currentPage,Model model) throws Exception{
		int i = adService.deleteAd(id);
		
		if(i>0)
		{
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.REMOVE_SUCCESS);
		}else{
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.REMOVE_FAIL);
		}
		
		//储存当前分页数
		model.addAttribute("currentPage", currentPage);
		
		//重新去查询adList(虽然currentPage>totalpage,但是会被page对象判断后重新赋值)
		return "forward:/ad/search";
	}
	
	@RequestMapping(value="/add",method={RequestMethod.GET})
	public String addPage(){
		return "content/adAdd";
	}
	
	@RequestMapping(value="/add",method={RequestMethod.POST})
	public String add(AdDto adDto,Model model) throws Exception{
		if(adService.addAd(adDto)){
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.ADD_SUCCESS);
		}else{
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.ADD_FAIL);
		}
		return "/content/adAdd";
	}
	
	/**
	 * 修改页初始化
	 */
	@RequestMapping("/modifyInit")
	public String modifyInit(Model model, @RequestParam("id") Long id) {
		model.addAttribute("modifyObj", adService.getById(id));
		return "/content/adModify";
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/modify")
	public String modify(Model model, AdDto adDto) {
		if (adService.modify(adDto)) {
			model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_SUCCESS);
		} else {
			model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_FAIL);
		}
		//重新从数据库取值，放在修改后图片不可查
		model.addAttribute("modifyObj", adService.getById(adDto.getId()));
		return "/content/adModify";
	}
	
}
