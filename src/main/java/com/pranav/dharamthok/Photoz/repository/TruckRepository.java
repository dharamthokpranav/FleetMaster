package com.pranav.dharamthok.Photoz.repository;


import com.pranav.dharamthok.Photoz.model.Truck;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TruckRepository extends MongoRepository<Truck, String> {

    }
