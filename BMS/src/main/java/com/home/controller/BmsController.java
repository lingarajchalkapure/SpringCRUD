package com.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.service.BMSService;

@Controller
public class BmsController {

	@Autowired
	private BMSService ser;
	
	
	
}
