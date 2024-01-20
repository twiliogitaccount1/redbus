package com.flightreservation.repository;

import com.flightreservation.entity.Flight;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight , Long>
{
     // custom query
    List<Flight> findFlights(String departure_city , String arrival_city , Date date_of_departure);


}
