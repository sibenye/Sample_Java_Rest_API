package com.forrent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.forrent.objects.User;
import com.forrent.objects.Listing;
import com.forrent.repositories.ListingRepository;
import com.forrent.repositories.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {	
	
	@Autowired
	private ListingRepository listingRepository;
	
	@Autowired
	private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		listingRepository.deleteAll();
		userRepository.deleteAll();

		// save a couple of listings
		Listing listing1 = new Listing("1", "Admirals Way Apartments");
		Listing listing2 = new Listing("2", "Stockley Gardens");
		Listing listing3 = new Listing("3", "Ghent Apartments");
		Listing listing4 = new Listing("4", "Colley Village");
		Listing listing5 = new Listing("5", "Lincoln View");
		
		listingRepository.save(listing1);
		listingRepository.save(listing2);
		listingRepository.save(listing3);
		listingRepository.save(listing4);
		listingRepository.save(listing5);
		
		List<Listing> listings1 = new ArrayList<Listing>();
		List<Listing> listings2 = new ArrayList<Listing>();
		
		listings1.add(listing1);
		listings1.add(listing2);
		listings1.add(listing3);
		
		listings2.add(listing4);
		listings2.add(listing5);
		
		
		User user1 = new User("101", "John", "Guart", listings1);
		User user2 = new User("102", "David", "Stack", listings2);
		userRepository.save(user1);
		userRepository.save(user2);
		
	}
}