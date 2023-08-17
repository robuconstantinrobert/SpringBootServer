package com.OBDProject.OBDProject.models.BoostPressure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class BoostPressureDAO {
	
	@Autowired
	private BoostPressureRepository repository;
	
	public List<BoostPressure> getAllBoostValues()
	{
		List<BoostPressure> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
