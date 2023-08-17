package com.OBDProject.OBDProject.models.CoolantTemp;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coolant_temp_table")//aici e o problema
public class CoolantTemp {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "coolant")
	private int coolantValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getCoolantTempValue() {
		return coolantValue;
	}
	public void setCoolantTemp(int coolantValue) {
		this.coolantValue = coolantValue;
	}
	@Override
	public String toString() {
		return "CoolantTemp [timestamp=" + timestamp + ", coolantValue=" + coolantValue + "]";
	}
}