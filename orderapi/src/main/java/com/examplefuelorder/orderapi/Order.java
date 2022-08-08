package com.examplefuelorder.orderapi;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Order {
    @Id
    private String orderId;
    private String type;
    private Double capacity;

    public Order(){
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
}
