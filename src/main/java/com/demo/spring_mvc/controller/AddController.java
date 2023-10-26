package com.demo.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring_mvc.model.Student;
import com.demo.spring_mvc.repository.StudentRepository;

@Controller
public class AddController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2) {
		ModelAndView mv = new ModelAndView();
		int result = num1 + num2;
		mv.addObject("result", result);
		mv.setViewName("result");
		return mv;
	}
}
