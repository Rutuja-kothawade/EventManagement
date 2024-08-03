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
import com.mypack.entity.Oragnizer;
import com.mypack.service.OrganizerService;

@RestController
@RequestMapping("/organizers")
public class OragnizerController {
	 @Autowired
	    private OrganizerService organizerService;

	    @PostMapping
	    public ResponseEntity<Oragnizer> createOrganizer(@RequestBody Oragnizer organizer) {
	        return ResponseEntity.ok(organizerService.createOrganizer(organizer));
	    }

	   
	    @GetMapping("/{id}")
	    public ResponseEntity<Oragnizer> getEventById(@PathVariable Long id) {
	        return ResponseEntity.ok(organizerService.getEventById(id));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Oragnizer> updateOrganizer(@PathVariable Long id, @RequestBody Oragnizer organizer) {
	        Oragnizer updatedOrganizer = organizerService.updateOrganizer(id, organizer);
	        return updatedOrganizer != null ? ResponseEntity.ok(updatedOrganizer) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteOrganizer(@PathVariable Long id) {
	        organizerService.deleteOrganizer(id);
	        return ResponseEntity.noContent().build();
	    }
	    @GetMapping
	    public ResponseEntity<List<Oragnizer>> getAllOrganizers() {
	        return ResponseEntity.ok(organizerService.getAllOrganizers());
	    }

}
