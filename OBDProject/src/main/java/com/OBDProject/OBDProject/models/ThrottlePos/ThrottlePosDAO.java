package com.OBDProject.OBDProject.models.ThrottlePos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class ThrottlePosDAO {
	
	@Autowired
	private ThrottlePosRepository repository;
	
	public List<ThrottlePos> getAllThrottleValues()
	{
		List<ThrottlePos> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
