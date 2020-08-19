package com.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.BMSDao;

@Service
public class BMSServiceImpl implements BMSService {

	@Autowired
	private BMSDao dao;
	
	

}
