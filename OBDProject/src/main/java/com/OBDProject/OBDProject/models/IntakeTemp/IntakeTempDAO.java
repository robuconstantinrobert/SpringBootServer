package com.OBDProject.OBDProject.models.IntakeTemp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class IntakeTempDAO {
	
	@Autowired
	private IntakeTempRepository repository;
	
	public List<IntakeTemp> getAllIntakeVaues()
	{
		List<IntakeTemp> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
