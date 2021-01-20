package com.app.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehicleservice.model.Root;

@Repository
public interface VehicleRequestRepository extends JpaRepository<Root, Long> {
}