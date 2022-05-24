package com.jshsb.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jshsb.sm.DAO.StudentDAO;
import com.jshsb.sm.api.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@GetMapping("/showStudent")
	public List<Student> showStudentList(Model model) {
		List<Student> studentList= studentDAO.loadStudents();
		model.addAttribute("students", studentList);
		return studentList;
		
	}

}
