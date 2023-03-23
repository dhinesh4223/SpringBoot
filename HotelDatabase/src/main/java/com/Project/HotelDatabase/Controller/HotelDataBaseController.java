package com.Project.HotelDatabase.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.HotelDatabase.Repository.HotelDataBaseRepository;
import com.Project.HotelDatabase.model.HotelDataBase;

@RestController
@RequestMapping("/api")
public class HotelDataBaseController {
	@Autowired
	private HotelDataBaseRepository hdbRepository;
	
	@GetMapping("/display")
	public List<HotelDataBase> getAllReceipe(){
		return hdbRepository.findAll();
	}

}
