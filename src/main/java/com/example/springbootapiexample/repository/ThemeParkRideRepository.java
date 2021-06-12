package com.example.springbootapiexample.repository;

import com.example.springbootapiexample.entity.ThemeParkRide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeParkRideRepository extends JpaRepository<ThemeParkRide, Long> {
}
