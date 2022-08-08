package com.project.fual.fualdistributionorder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Order {

    public Order() {
    }

    public Order(String id, String fualType, String capacity) {
        this.id = id;
        this.fualType = fualType;
        this.capacity = capacity;
    }

    @JsonProperty("Id")
    private String id;

    @JsonProperty("FualType")
    private String fualType;

    @JsonProperty("Capacity")
    private String capacity;

    private int fualTypeNumber;
    private int fualCapacityNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFualType() {
        return fualType;
    }

    public void setFualType(String fualType) {
        this.fualType = fualType;

        switch (fualType){
            case "Petrol 92":
                fualTypeNumber=1;
                break;
            case "Petrol 95":
                fualTypeNumber=2;
                break;
            case "Diesel":
                fualTypeNumber=3;
                break;
            case "Super Diesel":
                fualTypeNumber=4;
                break;
        }
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
        switch (capacity){
            case "3300":
                fualCapacityNumber=1;
                break;
            case "6600":
                fualCapacityNumber=2;
                break;
            case "13200":
                fualCapacityNumber=3;
                break;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(""+id+fualTypeNumber+fualCapacityNumber);
        return sb.toString();
    }
}
