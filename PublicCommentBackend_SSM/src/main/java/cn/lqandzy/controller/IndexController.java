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
	
	/*@RequestMapping()
	public void index(){
		int ProgramNo=1;
		int AreaNo=1;
		int InStyle=0;
		int nSpeed=2;
		int DelayTime=20;
		int hProgram;
		hProgram=led.CreateProgram(256, 160, 2);
		System.out.println("111111111111111");
		led.AddProgram(hProgram, 1, 0, 1);
		led.AddImageTextArea(hProgram, 1, 1, 0, 0, 256, 160, 1);
		led.AddFileToImageTextArea(hProgram, ProgramNo, AreaNo,"", InStyle, nSpeed, DelayTime);
		//led.AddFileToImageTextArea(hProgram, 1, 1, "77.png", 0, 2, 10);

		led.AddImageTextArea(hProgram, 1, 1, 0, 0, 64, 32, 1);
		led.AddMultiLineTextToImageTextArea(hProgram, 1, 1, 0, "hello world", "Tahoma", 9, 0xff, 0, 0, 0, 1, 4, 2, 1, 1);
		//led.AddFileToImageTextArea(hProgram, 1, 1, "your file full path", 1, 4, 2);
		
		led.AddProgram(hProgram, 2, 0, 1);
		led.AddImageTextArea(hProgram, 2, 1, 0, 0, 64, 16, 1);
		led.AddSinglelineTextToImageTextArea(hProgram, 2, 1, 0, "welcome to listen vision", "Tahoma", 12, 0xff, 0, 0, 0, 6, 4, 1);
		
		led.AddDigitalClockArea(hProgram, 2, 2, 0, 16, 64, 16, "Tahoma", 9, 0xff, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0xff, 0, 0xff, 2, 0xff);
		
		System.out.println(led.NetWorkSend("192.168.0.248", hProgram));
		led.DeleteProgram(hProgram);
		
	}*/
}
