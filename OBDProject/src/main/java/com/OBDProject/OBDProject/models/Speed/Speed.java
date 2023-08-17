package com.OBDProject.OBDProject.models.Speed;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "speed_table")//aici e o problema
public class Speed {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "Speed")
	private int speedValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getSpeedValue() {
		return speedValue;
	}
	public void setRPMValue(int speedValue) {
		this.speedValue = speedValue;
	}
	@Override
	public String toString() {
		return "Speed [timestamp=" + timestamp + ", speedValue=" + speedValue + "]";
	}
}