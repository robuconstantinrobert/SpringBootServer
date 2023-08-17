package com.OBDProject.OBDProject.models.FuelLevel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class FuelLevelDAO {
	
	@Autowired
	private FuelLevelRepository repository;
	
	public List<FuelLevel> getAllFuelValues()
	{
		List<FuelLevel> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
