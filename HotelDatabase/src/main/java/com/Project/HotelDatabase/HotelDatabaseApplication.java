package com.Project.HotelDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Project.HotelDatabase.Repository.HotelDataBaseRepository;
import com.Project.HotelDatabase.model.HotelDataBase;

@SpringBootApplication
public class HotelDatabaseApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HotelDatabaseApplication.class, args);
	}
	@Autowired
	private HotelDataBaseRepository hdbRepository;
	@Override
	public void run(String... args) throws Exception{
		this.hdbRepository.save(new HotelDataBase("Biriyani", 6800.0));
		this.hdbRepository.save(new HotelDataBase("Curd Rice", 7000.0));
	}

}
