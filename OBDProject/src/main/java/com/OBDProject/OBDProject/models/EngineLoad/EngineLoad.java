package com.OBDProject.OBDProject.models.EngineLoad;


import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "engine_load_table")//aici e o problema
public class EngineLoad {
	
	@Id
	@Column(name = "timestamp")//
	private Timestamp timestamp;
	@Column(name = "engine_load")
	private int loadValue;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public int getLoadValue() {
		return loadValue;
	}
	public void setLoadValue(int loadValue) {
		this.loadValue = loadValue;
	}
	@Override
	public String toString() {
		return "EngineLoad [timestamp=" + timestamp + ", loadValue=" + loadValue + "]";
	}
}