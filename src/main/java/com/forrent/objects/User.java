package com.forrent.objects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	private final String id;
    private final String firstName;
    private final String lastName;
    @DBRef
    private List<Listing> listings = new ArrayList<>();
    
   /* 
    public User(String id, String firstName, String lastName) {
    	this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }*/

    public User(String id, String firstName, String lastName, List<Listing> listings) {
    	this.id = id;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.listings = listings;
    }
    
	public String getId() {
		return id;
	}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public List<Listing> getListings() {
        return listings;
    }

}