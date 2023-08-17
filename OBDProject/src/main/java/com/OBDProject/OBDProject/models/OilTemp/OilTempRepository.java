package com.OBDProject.OBDProject.models.OilTemp;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OilTempRepository extends JpaRepository<OilTemp, Timestamp>{

}
