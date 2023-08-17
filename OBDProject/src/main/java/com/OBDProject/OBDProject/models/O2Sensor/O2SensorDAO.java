package com.OBDProject.OBDProject.models.O2Sensor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class O2SensorDAO {
	
	@Autowired
	private O2SensorRepository repository;
	
	public List<O2Sensor> getAllO2SensorValues()
	{
		List<O2Sensor> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
