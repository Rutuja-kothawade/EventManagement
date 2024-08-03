package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mypack.entity.Oragnizer;
import com.mypack.repository.OrganizerRepository;

@Service
public class OrganizerService {
	 @Autowired
	    private OrganizerRepository organizerRepository;

	    public Oragnizer createOrganizer(Oragnizer organizer) {
	        return organizerRepository.save(organizer);
	    }

	    public Oragnizer getEventById(Long id) {
	        return organizerRepository.findById(id).orElse(null);
	    }


	    public Oragnizer updateOrganizer(Long id, Oragnizer organizer) {
	        if (organizerRepository.existsById(id)) {
	            organizer.setId(id);
	            return organizerRepository.save(organizer);
	        }
	        return null;
	    }

	    public void deleteOrganizer(Long id) {
	        organizerRepository.deleteById(id);
	    }
	    public List<Oragnizer> getAllOrganizers() {
	        return organizerRepository.findAll();
	    }
}
