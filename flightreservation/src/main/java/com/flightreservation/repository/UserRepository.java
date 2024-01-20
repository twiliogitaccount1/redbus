package com.flightreservation.repository;

import com.flightreservation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long>
{
    User   findByEmail(String emailId);





}
