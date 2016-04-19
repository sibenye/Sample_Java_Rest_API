package com.forrent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forrent.objects.User;
import com.forrent.objects.Listing;
import com.forrent.repositories.ListingRepository;
import com.forrent.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    
    @Autowired
    UserController(UserRepository userRepository, ListingRepository listingRepository) {
    	this.userRepository = userRepository;
	}

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable String id) {
        return this.userRepository.findById(id);
    }
    
    @RequestMapping(value = "/{id}/listings", method = RequestMethod.GET)
    public List<Listing> getUserListings(@PathVariable String id) {
        return this.userRepository.findById(id).getListings();
    } 
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
    
}