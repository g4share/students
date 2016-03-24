package com.endava.internship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.endava.internship.service.StudentService;

@Controller
public class StudentsController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/spring/students")
	public ModelAndView saveStudentData() throws Exception {

		ModelAndView mv = new ModelAndView("students");
		mv.addObject("students", studentService.getStudents());

		return mv;
	}
}
