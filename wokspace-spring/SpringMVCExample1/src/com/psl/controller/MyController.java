package com.psl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("first")
public class MyController {
	@RequestMapping("hello")
	public ModelAndView sayHello()
	{
		return new ModelAndView("hello","msg","Hello All");
	}
	@RequestMapping("welcome")
	public ModelAndView sayWelcome()
	{
		return new ModelAndView("welcome","message","welcome all");
	}
}