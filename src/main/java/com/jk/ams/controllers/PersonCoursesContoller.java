package com.jk.ams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jk.ams.models.Courses;
import com.jk.ams.models.Sample;
import com.jk.ams.services.CoursesService;
import com.jk.ams.services.PersonCoursesService;

@Controller
public class PersonCoursesContoller {
	
	@Autowired
	private CoursesService coursesService;
	
	@Autowired
	private PersonCoursesService personCoursesService;

	@RequestMapping(value="/personCourses", method=RequestMethod.GET)
	public String getPersonCourses(Model model){
		List<Courses> coursesList = coursesService.getCourses();
		List<Courses> userCoursesList = coursesService.findCourses(1);
		model.addAttribute("courses", coursesList);
//		List<PersonCourses> pcList = personCoursesService.findCoursesByPersonId(1);
		Sample sample = new Sample();
		sample.setUserCourses(userCoursesList);
		model.addAttribute("sample", sample);
		return "personCourses";
	}
	
	@RequestMapping(value="/addPersonCourses", method=RequestMethod.POST)
	public String addPersonCourses(Model model,Sample sample,
			BindingResult result){
		System.out.println("courses ==>"+sample.getUserCourses());
		model.addAttribute("sample", sample);
		return "successpersonCourses";
	}
}
