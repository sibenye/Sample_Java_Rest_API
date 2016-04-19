package com.forrent.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forrent.objects.User;

public interface UserRepository extends MongoRepository<User, String> {
    
    public User findById(String id);

}