//package com.pranav.dharamthok.Photoz.web;
//
//import com.pranav.dharamthok.Photoz.model.Truck;
//import com.pranav.dharamthok.Photoz.repository.TruckRepository;
//import com.pranav.dharamthok.Photoz.service.EmailService;
//import com.pranav.dharamthok.Photoz.service.TruckService;
//import com.pranav.dharamthok.Photoz.web.TruckController;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Optional;
//import java.util.stream.Stream;
//
//import static net.bytebuddy.matcher.ElementMatchers.is;
//import static org.hamcrest.Matchers.hasSize;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(TruckController.class)
//public class TruckControllerTest {
//
//    @Autowired
//    private TruckService truckService;
//
//    @MockBean
//    private TruckRepository repository;
//
//    public void getTruckCoordinatesTest(){
//        when(repository.findAll()).thenReturn(Stream.of())
//    }
//}
//
