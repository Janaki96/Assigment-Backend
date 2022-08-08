package com.examplefuelorder.orderapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orderdata",
        path = "orderdata")

public interface OrderRepository extends MongoRepository <Order, String> {
}
