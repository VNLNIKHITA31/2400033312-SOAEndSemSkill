package com.example.restaurant.service;
import com.example.restaurant.entity.Restaurant;
import com.example.restaurant.repository.RestaurantRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RestaurantService {
 private final RestaurantRepository repository;
 public RestaurantService(RestaurantRepository repository){this.repository=repository;}
 public List<Restaurant> getAll(){return repository.findAll();}
 public Restaurant getById(Long id){return repository.findById(id).orElseThrow(()->new RuntimeException("Restaurant not found"));}
 public Restaurant save(Restaurant restaurant){return repository.save(restaurant);}
 public void delete(Long id){repository.deleteById(id);}
}
