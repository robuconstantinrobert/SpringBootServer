package com.OBDProject.OBDProject.models.Odometer;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "odometer_table")//aici e o problema
public class Odometer {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "Odometer")
	private int odometerValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getOdometerValue() {
		return odometerValue;
	}
	public void setOdometerValue(int odometerValue) {
		this.odometerValue = odometerValue;
	}
	@Override
	public String toString() {
		return "Odometer [timestamp=" + timestamp + ", odometerValue=" + odometerValue + "]";
	}
}