package com.fualdistributionallocation.allocationservice.service;

import com.fualdistributionallocation.allocationservice.model.Order;
import com.fualdistributionallocation.allocationservice.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class allocateServiceImpl implements allocateService{

    @Autowired
    orderRepository orderrepository;

    @Override
    public Order save(Order order) {
        return orderrepository.save(order);
    }

    @Override
    public Order fetchOrderById(int id) {

        Optional<Order> ord = orderrepository.findById(id);
        if(ord.isPresent()){
            return ord.get();
        }
        return null;
    }
}
