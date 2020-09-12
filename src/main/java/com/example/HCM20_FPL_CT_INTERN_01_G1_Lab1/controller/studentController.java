package com.example.HCM20_FPL_CT_INTERN_01_G1_Lab1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.HCM20_FPL_CT_INTERN_01_G1_Lab1.entity.student;
import com.example.HCM20_FPL_CT_INTERN_01_G1_Lab1.service.studentService;


@Controller
public class studentController {
	
	@Autowired
	studentService studentService;
	/*
	 * display interface
	 * */
	
	@GetMapping(value = "/index")
	public String index(ModelMap model) {
		  List<student> listStudents = studentService.findAll();
          model.addAttribute("getStudent", listStudents);
          return "index";
	}
	
	/*
	 * display functional interface
	 * */
	@GetMapping(value = "/excute")
	public String showInsert(ModelMap model) {
          model.addAttribute("students", new student());
//          model.addAttribute("status", "true");
          return "excute";
	}
	
	/*
	 * search by name
	 * */
	@RequestMapping(value = "/excute",params = "search")
	public String search(ModelMap model, @RequestParam("tk") String tk) {
		List<student> listStudents = studentService.findByName(tk);
		model.addAttribute("getStudentInf ", listStudents);
		return "searchStudent";
	}
	
	/*
	 * add student
	 * */
	@RequestMapping(value = "/student",params = "add")
	public String addStudent(@ModelAttribute("students") student std) {
		studentService.save(std);
		return "redirect:index";
	}
	
	/*
	 * delete student
	 * */
	@RequestMapping(value = "/student_delete{id}")
	public String deleteStudent(@PathVariable("id") String id) {
		studentService.deleteById(id);
		return "redirect:index";
	}
	
	/*
	 * display information student
	 * */
	@RequestMapping(value = "/student_edit{id}")
	public ModelAndView edit(@PathVariable("id") String id, ModelMap mod) {
		ModelAndView model = new ModelAndView("excute");
		model.addObject("students",studentService.getOne(id));
//		mod.addAttribute("status", "false");
		return model;
	}
	
	/*
	 * update student
	 * */
	@RequestMapping(value = "/student",params = "update")
	public String updateStudent(@ModelAttribute("students") student std) {
		studentService.save(std);
		return "redirect:index";
	}
}

