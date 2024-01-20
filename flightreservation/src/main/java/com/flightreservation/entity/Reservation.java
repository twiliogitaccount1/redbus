package com.flightreservation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private boolean checkedIn ;
    private  int numberOfBags ;
    @OneToOne
    private Passenger passenger ;
    @OneToOne
    private  Flight flight ;


}
