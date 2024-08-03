package com.mypack.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.entity.Event;
import com.mypack.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	 @Autowired
	    private EventService eventService;

	    @PostMapping
	    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
	        return ResponseEntity.ok(eventService.createEvent(event));
	    }

	    @GetMapping
	    public ResponseEntity<List<Event>> getAllEvents() {
	        return ResponseEntity.ok(eventService.getAllEvents());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Event> getEventById(@PathVariable Long id) {
	        return ResponseEntity.ok(eventService.getEventById(id));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event event) {
	        Event updatedEvent = eventService.updateEvent(id, event);
	        return updatedEvent != null ? ResponseEntity.ok(updatedEvent) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
	        eventService.deleteEvent(id);
	        return ResponseEntity.noContent().build();
	    }

	    @GetMapping("/venue/{venueId}")
	    public ResponseEntity<List<Event>> getEventsByVenue(@PathVariable Long venueId) {
	        return ResponseEntity.ok(eventService.getEventsByVenue(venueId));
	    }

	    @GetMapping("/organizer/{organizerId}")
	    public ResponseEntity<List<Event>> getEventsByOrganizer(@PathVariable Long organizerId) {
	        return ResponseEntity.ok(eventService.getEventsByOrganizer(organizerId));
	    }
	
}
