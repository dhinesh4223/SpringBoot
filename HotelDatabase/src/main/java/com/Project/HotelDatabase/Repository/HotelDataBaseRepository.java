package com.Project.HotelDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.HotelDatabase.model.HotelDataBase;

public interface HotelDataBaseRepository extends JpaRepository<HotelDataBase, Long> {

}
