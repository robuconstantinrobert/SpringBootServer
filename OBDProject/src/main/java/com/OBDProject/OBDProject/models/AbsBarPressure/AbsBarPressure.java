package com.OBDProject.OBDProject.models.AbsBarPressure;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "abs_bar_press")//aici e o problema
public class AbsBarPressure {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "absolute_barometric_pressure")
	private int absBarPressureValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getAbsBarPressureValue() {
		return absBarPressureValue;
	}
	public void setAbsBarPressureValue(int absBarPressureValue) {
		this.absBarPressureValue = absBarPressureValue;
	}
	@Override
	public String toString() {
		return "AbsBarPressure [timestamp=" + timestamp + ", absBarPressureValue=" + absBarPressureValue + "]";
	}
	
	
	
	
	
}
