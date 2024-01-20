package com.flightreservation.serviceImpl;

import com.flightreservation.entity.Flight;
import com.flightreservation.repository.FlightRepository;
import com.flightreservation.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService
{
    @Autowired
    private FlightRepository flightRepo;

   // to save flight details
    @Override
    public Flight saveFlight(Flight flight)
    {
        Flight savedFlight = flightRepo.save(flight);
        return savedFlight;
    }

    // to fing flights
    @Override
    public List<Flight> findFlights2(String departureCity, String arrivalCity, Date dateOfDeparture)
    {
        List<Flight> listOfFlights = flightRepo.findFlights(departureCity, arrivalCity,  dateOfDeparture);


        return listOfFlights;
    }

    // to search flight based on id
    @Override
    public Flight showCompleteReservation(Long flightId)
    {
        Flight flight = flightRepo.findById(flightId).get();
        return flight;
    }


}
