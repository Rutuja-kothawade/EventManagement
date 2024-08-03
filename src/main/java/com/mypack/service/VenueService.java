package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mypack.entity.Venue;
import com.mypack.repository.VenueRepository;

@Service
public class VenueService {
	 @Autowired
	    private VenueRepository venueRepository;

	    public Venue createVenue(Venue venue) {
	        return venueRepository.save(venue);
	    }

	    public Venue getEventById(Long id) {
	        return  venueRepository.findById(id).orElse(null);
	    }


	    public Venue updateVenue(Long id, Venue venue) {
	        if (venueRepository.existsById(id)) {
	            venue.setId(id);
	            return venueRepository.save(venue);
	        }
	        return null;
	    }

	    public void deleteVenue(Long id) {
	        venueRepository.deleteById(id);
	    }
	    public List<Venue> getAllVenues() {
	        return venueRepository.findAll();
	    }
}
