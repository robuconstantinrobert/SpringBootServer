package com.OBDProject.OBDProject.models.ThrottlePos;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "throttle_pos_table")//aici e o problema
public class ThrottlePos {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "throttle_pos")
	private int throttleValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getThrottleValue() {
		return throttleValue;
	}
	public void setThrottleValue(int throttleValue) {
		this.throttleValue = throttleValue;
	}
	@Override
	public String toString() {
		return "ThrottlePos [timestamp=" + timestamp + ", throttleValue=" + throttleValue + "]";
	}
}