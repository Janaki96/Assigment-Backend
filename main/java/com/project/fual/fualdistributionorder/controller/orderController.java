package com.project.fual.fualdistributionorder.controller;

import com.project.fual.fualdistributionorder.model.Order;
import com.project.fual.fualdistributionorder.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
@CrossOrigin(origins = "http://localhost:4200")
public class orderController {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String topic = "neworder";

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String post(@RequestBody Order orderData){
        //Order order1 = orderService.save(order);

        kafkaTemplate.send(topic, orderData.toString());
        //System.out.println(new Order(orderData.getId(), orderData.getFualType(), orderData.getCapacity()));
        System.out.println(orderData);
        return "Success";
    }
}
