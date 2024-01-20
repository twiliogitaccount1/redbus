package com.flightreservation.service;

import com.flightreservation.entity.Flight;

import java.util.Date;
import java.util.List;

public interface FlightService
{
    // to save flight details
    Flight saveFlight(Flight flight);

    List<Flight> findFlights2(String departureCity, String arrivalCity, Date dateOfDeparture);


    Flight showCompleteReservation(Long flightId);

}
