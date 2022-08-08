package com.fualdistributionallocation.allocationservice.logic;

import com.fualdistributionallocation.allocationservice.model.Order;
import com.fualdistributionallocation.allocationservice.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class allocationLogic {

    @Autowired
    Order order;

    @Autowired
    private orderRepository orderrepository;

    int petrol92Capacity = 100000;
    int petrol95Capacity = 100000;
    int dieselCapacity = 100000;
    int superDieselCapacity = 100000;

    int petrol92Remaining = 100000;
    int petrol95Remaining = 100000;
    int dieselRemaining = 100000;
    int superDieselRemaining = 100000;

    public void setIdValues(String s) {
        int idValue = Integer.parseInt(s);
        order.setId(idValue);
    }

    public void setFualTypeValues(String s) {
        switch (s) {
            case "1":
                order.setType("petrol-92");
                break;
            case "2":
                order.setType("petrol-95");
                break;
            case "3":
                order.setType("diesel");
                break;
            case "4":
                order.setType("super diesel");
                break;
        }
    }

    public void setCapacityValues(String s) {

        switch (s) {
            case "1":
                order.setCapacity(3300);
                break;
            case "2":
                order.setCapacity(6600);
                break;
            case "3":
                order.setCapacity(13200);
                break;
        }
    }



    public boolean allocate(){



        switch (order.getType()){
            case "petrol-92":
                if (petrol92Remaining >= order.getCapacity()){
                    //orderrepository.save(order);
                    petrol92Remaining -= order.getCapacity();
                    System.out.println(petrol92Remaining);
                    return true;
                }
                else {
                    System.out.println("There is no enough petrol 92 in stock");
                    return false;
                }



            case "petrol-95":
                if (petrol95Remaining >= order.getCapacity()){
                   // orderrepository.save(order);
                    petrol95Remaining-=order.getCapacity();
                    return true;
                }
                else {
                    System.out.println("There is no enough petrol 95 in stock");
                    return false;
                }

            case "diesel":
                if (dieselRemaining >= order.getCapacity()){
                   // orderrepository.save(order);
                    dieselRemaining-=order.getCapacity();
                    return true;
                }
                else{
                    System.out.println("There is no enough diesel in stock");
                    return false;
                }

            case "super diesel":
                if (superDieselRemaining >= order.getCapacity()){
                   //    orderrepository.save(order);
                    superDieselRemaining-=order.getCapacity();
                    return true;
                }
                else{
                    System.out.println("There is no enough super diesel in stock");
                    return false;
                }

            default:
                return false;
        }




    }
}
