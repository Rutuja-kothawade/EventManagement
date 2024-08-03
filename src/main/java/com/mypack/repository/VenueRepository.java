package com.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypack.entity.Venue;



public interface VenueRepository extends JpaRepository<Venue,Long >{

}
