package com.fualdistributionallocation.allocationservice.service;

import com.fualdistributionallocation.allocationservice.model.Order;
import org.springframework.stereotype.Service;

public interface allocateService {

        Order save(Order order);

        Order fetchOrderById(int id);

}
