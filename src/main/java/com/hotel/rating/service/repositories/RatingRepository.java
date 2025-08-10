package com.hotel.rating.service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.rating.service.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{
	
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);

}
