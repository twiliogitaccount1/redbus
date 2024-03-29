package com.flightreservation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(name = "first_name" , nullable = false)
    private  String firstName ;
    @Column(name = "last_name" , nullable = false)
    private  String lastName ;
    @Column(name = "email" , nullable = false)
    private  String email ;
    @Column(name = "password" , nullable = false)
    private  String password ;




}
