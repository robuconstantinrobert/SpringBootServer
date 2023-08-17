package com.OBDProject.OBDProject.models.Odometer;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OdometerRepository extends JpaRepository<Odometer, Timestamp>{

}
