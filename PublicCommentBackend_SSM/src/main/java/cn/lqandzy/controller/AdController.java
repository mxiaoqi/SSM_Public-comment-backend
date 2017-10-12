package cn.lqandzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ad")
public class AdController {
	
	@RequestMapping()
	public String init(){
		return "content/adList";
	}
	
	@RequestMapping(value="/addList")
	public String addList(){
		return "content/adAdd";
	}
}
