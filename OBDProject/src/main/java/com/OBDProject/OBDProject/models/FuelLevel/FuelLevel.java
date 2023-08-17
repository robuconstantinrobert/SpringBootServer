package com.OBDProject.OBDProject.models.FuelLevel;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fuel_level_table")//aici e o problema
public class FuelLevel {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "fuel_level")
	private int fuelValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getFuelValue() {
		return fuelValue;
	}
	public void setFuelValue(int fuelValue) {
		this.fuelValue = fuelValue;
	}
	@Override
	public String toString() {
		return "FuelLevel [timestamp=" + timestamp + ", fuelValue=" + fuelValue + "]";
	}
}