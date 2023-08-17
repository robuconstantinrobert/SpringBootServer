package com.OBDProject.OBDProject.models.Odometer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class OdometerDAO {
	
	@Autowired
	private OdometerRepository repository;
	
	public List<Odometer> getAllOdometerValues()
	{
		List<Odometer> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
