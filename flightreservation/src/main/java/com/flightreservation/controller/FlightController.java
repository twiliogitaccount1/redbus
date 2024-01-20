package com.flightreservation.controller;

import com.flightreservation.entity.Flight;
import com.flightreservation.entity.User;
import com.flightreservation.repository.FlightRepository;
import com.flightreservation.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/flight")
public class FlightController
{
    @Autowired
    private FlightService flightService ;



    // to save flight details

    @PostMapping
    public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight) {
        Flight savedFlight = flightService.saveFlight(flight);
        return new ResponseEntity<>(savedFlight, HttpStatus.CREATED);
    }

     // to find flights
    @GetMapping("/{dapartureCity}&{arrivalCity}&{DateOfDeparture}")
    public  ResponseEntity<List<Flight>> findFlight(@RequestParam String departureCity , @RequestParam String arrivalCity , @RequestParam Date dateOfDeparture)
     {
         List<Flight> listOfFlights = flightService.findFlights2(departureCity, arrivalCity, dateOfDeparture);
         return new ResponseEntity<>(listOfFlights,HttpStatus.OK);
     }

    @PostMapping("/completeReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId){
        Flight flight = flightService.showCompleteReservation(flightId);
        return "reservation successfully";
    }





}
