package com.OBDProject.OBDProject.models.BoostPressure;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "boost_pressure_table")//aici e o problema
public class BoostPressure {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "Boost")
	private int boostValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getBoostValue() {
		return boostValue;
	}
	public void setBoostValue(int rpm) {
		this.boostValue = rpm;
	}
	@Override
	public String toString() {
		return "BoostPressure [timestamp=" + timestamp + ", boostValue=" + boostValue + "]";
	}
}