package com.example.restaurant.controller;
import com.example.restaurant.entity.Restaurant;
import com.example.restaurant.service.RestaurantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/restaurants")
@CrossOrigin
public class RestaurantController {
 private final RestaurantService service;
 public RestaurantController(RestaurantService service){this.service=service;}
 @GetMapping 
 public List<Restaurant> getAll(){return service.getAll();}
 @GetMapping("/{id}") 
 public Restaurant getOne(@PathVariable Long id){
	 return service.getById(id);
	 }
 @PostMapping 
 public Restaurant create(@RequestBody Restaurant restaurant){
	 return service.save(restaurant);
	 }
 @DeleteMapping("/{id}") 
 public String delete(@PathVariable Long id){
	 service.delete(id);return "Restaurant deleted";
	 }
}
