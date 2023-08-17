package com.OBDProject.OBDProject.models.EngineLoad;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class EngineLoadDAO {
	
	@Autowired
	private EngineLoadRepository repository;
	
	public List<EngineLoad> getAllLoadValues()
	{
		List<EngineLoad> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
