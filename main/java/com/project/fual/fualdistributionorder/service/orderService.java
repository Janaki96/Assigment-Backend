package com.project.fual.fualdistributionorder.service;

import com.project.fual.fualdistributionorder.model.Order;
import org.springframework.stereotype.Service;

public interface orderService {
    public Order save(Order order);
}
