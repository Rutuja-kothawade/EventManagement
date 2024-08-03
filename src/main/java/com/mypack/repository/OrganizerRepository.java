package com.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypack.entity.Oragnizer;



public interface OrganizerRepository extends JpaRepository<Oragnizer,Long > {

}
