package cn.lqandzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lqandzy.constant.PageCodeEnum;
import cn.lqandzy.dto.AdDto;
import cn.lqandzy.service.AdService;
@Controller
@RequestMapping("ad")
public class AdController {
	@Autowired
	private AdService adService;
	
	@RequestMapping()
	public String init(){
		return "content/adList";
	}
	
	@RequestMapping(value="/addList")
	public String addList(){
		return "content/adAdd";
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
