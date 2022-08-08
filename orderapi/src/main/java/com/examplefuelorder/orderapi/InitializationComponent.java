package com.examplefuelorder.orderapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitializationComponent {
    @Autowired
    private OrderRepository orderRepository;

    @PostConstruct
    private void init(){

        orderRepository.deleteAll();

        Order order=new Order();
        order.setType("Petrol");
        order.setCapacity(12000.00);
        orderRepository.save(order);

        order=new Order();
        order.setType("Diesel");
        order.setCapacity(12000.00);
       orderRepository.save(order);
    }
}
