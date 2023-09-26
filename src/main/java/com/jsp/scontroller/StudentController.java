package com.jsp.scontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	@RequestMapping("/loadstu")
	public ModelAndView save(){
		ModelAndView andView = new ModelAndView("register.jsp");
		andView.addObject("stu",new Student());
		return andView;
	}
	
	@RequestMapping("/savestu")
	public ModelAndView saveStudent(@ModelAttribute Student student){
		Student student2 = service.saveStudent(student);
		if(student2 != null) {
			ModelAndView andView = new ModelAndView("studenthome.jsp");
			return andView.addObject("msg","Data Saved!");
		}
		else {
			ModelAndView andView = new ModelAndView("");
			return andView.addObject("msg","Data is not Saved!");
			
		}
	}
	
	@RequestMapping("/displaystu")
	public ModelAndView displayStudent(){
		List<Student> list =service.getAllStudent();
		if(list.size() > 0) {
			ModelAndView andView = new ModelAndView("displaystudent.jsp");
			return andView.addObject("list",list);
		}
		else {
			ModelAndView andView = new ModelAndView("studenthome.jsp");
			return andView.addObject("msg","Data Not Present!");
		}
	}
	
	@RequestMapping("/editstu")
	public ModelAndView getStudentById(@RequestParam int id){
		Student student=service.getById(id);
		ModelAndView andView = new ModelAndView("updatestudent.jsp");
		andView.addObject("edit",student);
		return andView;
	}
	
	@RequestMapping("/updatestu")
	public ModelAndView updateStudent(@ModelAttribute Student student){
		service.upadateStudent(student);
		List<Student> list =service.getAllStudent();
		ModelAndView andView = new ModelAndView("displaystudent.jsp");
		andView.addObject("list",list);
		return andView;
	}
	
	@RequestMapping("/deletestu")
	public ModelAndView delete(@RequestParam int id){
		service.deleteStudent(id);
		List<Student> list =service.getAllStudent();
		ModelAndView andView = new ModelAndView("displaystudent.jsp");
		andView.addObject("list",list);
		return andView;
	}
	
	
}