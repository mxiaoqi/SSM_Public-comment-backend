package cn.lqandzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
/**
 * 主页控制层
 * @author Administrator
 * 
 */
public class IndexController {
	
	@RequestMapping()
	public String index(){
		return "system/index";
	}
}
