package cn.lqandzy.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cn.lqandzy.constant.PageCodeEnum;
import cn.lqandzy.dto.AdDto;
import cn.lqandzy.service.AdService;

/**
 * 
 * @author muqi
 *
 */
@Controller
@RequestMapping("/ad")
public class AdController {
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
	
	
	@RequestMapping(value="/addList")
	public String addList(){
		return "content/adAdd";
	}
	
	@RequestMapping(value="/search")
	public String search(Model model,AdDto adDto) throws Exception{
		model.addAttribute("list", adService.searchByPage(adDto));
		model.addAttribute("searchParam", adDto);
		return "content/adList";
	}
	
	@RequestMapping(value="/remove")
	public String remove(@RequestParam("id") long id) throws Exception{
		System.out.println("11111111111111111111111111");
		
		
		return "forward:content/adList";
	}
	
	@RequestMapping(value="/add")
	public String add(AdDto adDto,Model model) throws Exception{
		if(adService.addAd(adDto)){
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.ADD_SUCCESS);
		}else{
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.ADD_FAIL);
		}
		return "/content/adAdd";
	}
	
}
