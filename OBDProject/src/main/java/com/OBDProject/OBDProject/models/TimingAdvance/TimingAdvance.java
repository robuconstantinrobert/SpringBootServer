package com.OBDProject.OBDProject.models.TimingAdvance;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "timing_advance_table")//aici e o problema
public class TimingAdvance {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "timing_advance")
	private int timingValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getTimingValue() {
		return timingValue;
	}
	public void setTimingValue(int timingValue) {
		this.timingValue = timingValue;
	}
	@Override
	public String toString() {
		return "TimingAdvance [timestamp=" + timestamp + ", timingValue=" + timingValue + "]";
	}
}