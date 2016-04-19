package com.forrent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forrent.objects.Listing;
import com.forrent.repositories.ListingRepository;

@RestController
@RequestMapping("/listings")
public class ListingController {

    private static final String template = "Here is your listing: %s!";
    private final ListingRepository listingRepository;
    
    @Autowired
    ListingController(ListingRepository listingRepository) {
		this.listingRepository = listingRepository;
	}

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Listing getListing(@PathVariable String id) {
        return this.listingRepository.findById(id);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Listing> getListings() {
        return this.listingRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> addListing(@RequestBody Listing listing) {
		return null;
		

	}
}