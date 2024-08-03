package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mypack.entity.Event;
import com.mypack.repository.EventRepository;

@Service
public class EventService {
	
	 @Autowired
	    private EventRepository eventRepository;

	    public Event createEvent(Event event) {
	        return eventRepository.save(event);
	    }

	    public List<Event> getAllEvents() {
	        return eventRepository.findAll();
	    }

	    public Event getEventById(Long id) {
	        return eventRepository.findById(id).orElse(null);
	    }

	    public Event updateEvent(Long id, Event event) {
	        if (eventRepository.existsById(id)) {
	            event.setId(id);
	            return eventRepository.save(event);
	        }
	        return null;
	    }

	    public void deleteEvent(Long id) {
	        eventRepository.deleteById(id);
	    }

	    public List<Event> getEventsByVenue(Long venueId) {
	        return eventRepository.findByVenueId(venueId);
	    }

	    public List<Event> getEventsByOrganizer(Long organizerId) {
	        return eventRepository.findByOrganizerId(organizerId);
	    }
	
	
}