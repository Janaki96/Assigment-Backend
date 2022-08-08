package com.fualdistributionallocation.allocationservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document("Order")
public class Order {

        @Id
        @JsonProperty("Id")
        private int id;

        @JsonProperty("FualType")
        private String type;

        @JsonProperty("Capacity")
        private int capacity;

    public Order() {
    }

    public Order(int id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("Id='").append(id).append('\'');
        sb.append(", FualType='").append(type).append('\'');
        sb.append(", Capacity='").append(capacity).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
