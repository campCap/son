package com.newlecture.webprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//@ResponseBody
	//@RequestMapping(value="/index", produces="text/html;charset=UTF-8")
	@RequestMapping("/index")
	public String index() {
		
		return "/WEB-INF/views/index.jsp";
	}
}
