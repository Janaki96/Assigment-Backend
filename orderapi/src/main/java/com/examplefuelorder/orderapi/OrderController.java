package com.examplefuelorder.orderapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderRepository OrderRepository;
    @GetMapping("/orders")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Order> getAllOrders(){
        return OrderRepository.findAll();
    }

}
