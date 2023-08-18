package com.digit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		
		ModelAndView mv=new ModelAndView("/WEB-INF/views/hello.jsp");
		mv.addObject("name","Ashish");
		return mv;
	}
	
	@RequestMapping
	
	public ModelAndView welcome() {
		ModelAndView mv1=new ModelAndView("/WEB-INF/views/welcome.jsp");
		return mv1;
	}
	
}
