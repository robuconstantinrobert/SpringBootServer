package com.OBDProject.OBDProject.models.O2Sensor;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "o2_sensor_table")//aici e o problema
public class O2Sensor {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "o2_sensor")
	private int o2sensorValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getO2SensorValue() {
		return o2sensorValue;
	}
	public void setO2SensorValue(int o2sensorValue) {
		this.o2sensorValue = o2sensorValue;
	}
	@Override
	public String toString() {
		return "O2Sensor [timestamp=" + timestamp + ", o2sensorValue=" + o2sensorValue + "]";
	}
}