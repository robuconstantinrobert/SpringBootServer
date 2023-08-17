package com.OBDProject.OBDProject.models.IntakeTemp;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "intake_temp_table")//aici e o problema
public class IntakeTemp {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "intake_temp")
	private int intakeValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getIntakeValue() {
		return intakeValue;
	}
	public void setIntakeValue(int intakeValue) {
		this.intakeValue = intakeValue;
	}
	@Override
	public String toString() {
		return "IntakeTemp [timestamp=" + timestamp + ", intakeValue=" + intakeValue + "]";
	}
}