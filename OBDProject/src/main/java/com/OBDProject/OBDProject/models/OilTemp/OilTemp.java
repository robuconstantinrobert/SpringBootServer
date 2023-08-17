package com.OBDProject.OBDProject.models.OilTemp;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oil_temp_table")//aici e o problema
public class OilTemp {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "oil_temp")
	private int oilValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getOilTempValue() {
		return oilValue;
	}
	public void setOilTempValue(int oilValue) {
		this.oilValue = oilValue;
	}
	@Override
	public String toString() {
		return "OilTemp [timestamp=" + timestamp + ", oilValue=" + oilValue + "]";
	}
}