package com.pranav.dharamthok.Photoz.service;

import com.pranav.dharamthok.Photoz.model.Truck;
import com.pranav.dharamthok.Photoz.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TruckService {
    @Autowired
    private TruckRepository truckRepository;


    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public Optional<Truck> getTruckById(String id) {
        return truckRepository.findById(id);
    }

    public Truck saveTruck(Truck truck) {
        return truckRepository.save(truck);
    }

    public void deleteTruck(String id) {
        truckRepository.deleteById(id);
    }
}
