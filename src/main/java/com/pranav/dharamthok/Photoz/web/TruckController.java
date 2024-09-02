package com.pranav.dharamthok.Photoz.web;

import com.pranav.dharamthok.Photoz.model.Truck;
import com.pranav.dharamthok.Photoz.repository.TruckRepository;
//import com.pranav.dharamthok.Photoz.service.EmailService;
import com.pranav.dharamthok.Photoz.service.EmailService;
import com.pranav.dharamthok.Photoz.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trucks")
public class TruckController {

    @Autowired
    private TruckService truckService;
    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail (@RequestParam String to, @RequestParam String subject, @RequestParam String text){
        emailService.sendSimpleMessage(to,subject,text);
        return "Email Sent Successfully";
    }

    @GetMapping("/coordinates")
    public List<Truck> getAllTruckCoordinates() {

        return truckService.getAllTrucks();
    }

    @GetMapping("/{id}")
    public Optional<Truck> getTruckById(@PathVariable String id) {
        Optional<Truck> truck = truckService.getTruckById(id);
        return truck;
    }

    @PostMapping("/add")
    public Truck addTruck(@RequestBody Truck truck) {
        return truckService.saveTruck(truck);
    }

    @PutMapping("/update/{id}")
    public Truck updateTruck(@PathVariable String id, @RequestBody Truck updatedTruck) {
        Optional<Truck> existingTruck = truckService.getTruckById(id);
        if (existingTruck.isPresent()) {
            Truck truck = existingTruck.get();
            truck.setLat(updatedTruck.getLat());
            truck.setLng(updatedTruck.getLng());
            truck.setName(updatedTruck.getName());
            System.out.println("API called coords updated with" + truck.getLat() +" "+truck.getLng());
            return truckService.saveTruck(truck);
        }
        return null; // Handle the case when truck is not found
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTruck(@PathVariable String id) {
        truckService.deleteTruck(id);
    }

}
