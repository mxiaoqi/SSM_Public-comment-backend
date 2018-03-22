package cn.lqandzy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.lqandzy.bean.Dic;
import cn.lqandzy.constant.DicTypeConst;
import cn.lqandzy.constant.PageCodeEnum;
import cn.lqandzy.dto.BusinessDto;
import cn.lqandzy.service.BusinessService;
import cn.lqandzy.service.DicService;

/**
 * 商户控制层
 * @author muqi
 *
 */
@Controller
@RequestMapping("/businesses")
public class BusinessController {
	@Autowired
	private BusinessService businessService;
	
	@Autowired
	private DicService dicService;
	/**
	 * 广告管理页初始化(点广告管理菜单进入的第一个页面)
	 * @throws Exception 
	 */
	@RequestMapping
	public String init(Model model, HttpServletRequest request) throws Exception {
		BusinessDto businessDto = new BusinessDto();
		model.addAttribute("list", businessService.listBusinesses(businessDto));
		model.addAttribute("searchParam", businessDto);
		return "content/businessList";
	}
	
	/**
	 * 跳转到添加商户
	 * @return
	 */
	@RequestMapping(value="/addBusinessPage",method={RequestMethod.GET})
	public String addBusinessPage(Model model){
		//设置查询条件
		Dic city=new Dic();
		city.setType(DicTypeConst.CITY);
		Dic category=new Dic();
		category.setType(DicTypeConst.CATEGORY);
		//查询数据
		List<Dic> cityList = dicService.listDics(city);
		List<Dic> categoryList = dicService.listDics(category);
		//给页面赋值
		model.addAttribute("cityList", cityList);
		model.addAttribute("categoryList", categoryList);
		return "content/businessAdd";
	}
	
	/**
	 * 添加商户
	 * @return
	 */
	@RequestMapping(value="/addBusiness",method={RequestMethod.POST})
	public ModelAndView addBusiness(BusinessDto businessDto){
		ModelAndView modelAndView=new ModelAndView();
		if(businessService.insert(businessDto)){
			modelAndView.addObject(PageCodeEnum.KEY, PageCodeEnum.ADD_SUCCESS);
		}else{
			modelAndView.addObject(PageCodeEnum.KEY, PageCodeEnum.ADD_FAIL);
		}
		modelAndView.setViewName("content/businessAdd");
		return modelAndView;
		
	}
	
	/**
	 * 根据参数查询广告列表数据
	 * @param model
	 * @param adDto 广告类传输对象
	 * @return
	 * @throws Exception
	 *//*
	@RequestMapping(value="/search")
	public String search(Model model,AdDto adDto) throws Exception{
		model.addAttribute("list", adService.searchByPage(adDto));
		model.addAttribute("searchParam", adDto);
		
		return "content/adList";
	}
	*//**
	 * 
	 * @param id 要删除的广告id
	 * @param currentPage 当前分页的当前页数
	 * @param model 
	 * @return
	 * @throws Exception
	 *//*
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
	
	
	
	@RequestMapping(value="/add",method={RequestMethod.POST})
	public String add(AdDto adDto,Model model) throws Exception{
		if(adService.addAd(adDto)){
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.ADD_SUCCESS);
		}else{
			model.addAttribute(PageCodeEnum.KEY,PageCodeEnum.ADD_FAIL);
		}
		return "/content/adAdd";
	}
	
	*/
	/**
	 * 修改页初始化
	 */
	@RequestMapping("/modifyInit")
	public String modifyInit(Model model, @RequestParam("id") Long id) {
		model.addAttribute("modifyObj", businessService.getById(id));
		return "/content/adModify";
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/modify")
	public String modify(Model model, BusinessDto businessDto) {
		if (adService.modify(adDto)) {
			model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_SUCCESS);
		} else {
			model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_FAIL);
		}
		//重新从数据库取值，防止修改后图片不可查
		model.addAttribute("modifyObj", adService.getById(businessDto.getId()));
		return "/content/adModify";
	}
	
}
