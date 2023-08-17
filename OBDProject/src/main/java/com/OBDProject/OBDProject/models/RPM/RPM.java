package com.OBDProject.OBDProject.models.RPM;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rpm_table")//aici e o problema
public class RPM {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "rpm")
	private int rpmValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getRPMValue() {
		return rpmValue;
	}
	public void setRPMValue(int rpm) {
		this.rpmValue = rpm;
	}
	@Override
	public String toString() {
		return "RPM [timestamp=" + timestamp + ", rpmValue=" + rpmValue + "]";
	}
}