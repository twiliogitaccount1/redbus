package com.flightreservation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flights")
public class Flight
{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private  String flightNumber ;
    private  String operatingAirlines ;
    private  String departureCity ;
    private  String arrivalCity ;
    private  Date dateOfDeparture ;
    private  Timestamp estimatedDepartureTime ;




}
