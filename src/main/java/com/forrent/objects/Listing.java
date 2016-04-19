package com.forrent.objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Listing {

	@Id
    private String id;
    private String name;
    
    public Listing() {}

    public Listing(String id, String name) {
    	this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}