package com.OBDProject.OBDProject.models.Speed;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class SpeedDAO {
	
	@Autowired
	private SpeedRepository repository;
	
	public List<Speed> getAllSpeedValues()
	{
		List<Speed> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
