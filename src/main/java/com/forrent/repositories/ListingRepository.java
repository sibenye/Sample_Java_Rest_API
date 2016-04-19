package com.forrent.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forrent.objects.Listing;

public interface ListingRepository extends MongoRepository<Listing, String> {
    
    public Listing findById(String id);

}