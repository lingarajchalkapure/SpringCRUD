package com.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.home.model.Employee;
import com.home.service.CRUDService;

@Controller
public class CRUDController {

	@Autowired
	private CRUDService service;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/empform")
	public String showform(){    
        return "empform"; 
   }
	
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute Employee emp){    
        service.save(emp);    
        return "redirect:/viewemp";    
    }    
	@RequestMapping("/viewemp")    
    public String viewemp(Model m){    
        List<Employee> emp_list=service.getEmployees();    
        m.addAttribute("emp_list",emp_list);  
        return "viewemp";    
    }    
	
	@RequestMapping("/editemp")
	public ModelAndView editEmp(@RequestParam(value="id",required=false) int id,Model m)
	{
		Employee emplyee=service.editEmployee(id);
		m.addAttribute("edit_emp", emplyee);
		return new ModelAndView("empform");
	}
	
	@RequestMapping(value="/deleteemp")
	public String deleteEmployee(@RequestParam(value="id",required=false) int id)
	{
		service.deleteEmployee(id);
		return "redirect:/viewemp";
	}
	
	
	
	
}
