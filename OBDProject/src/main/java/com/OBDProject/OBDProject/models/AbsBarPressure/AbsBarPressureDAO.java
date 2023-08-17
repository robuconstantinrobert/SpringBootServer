package com.OBDProject.OBDProject.models.AbsBarPressure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class AbsBarPressureDAO {
	
	@Autowired
	private AbsBarPressureRepository repository;
	
	public List<AbsBarPressure> getAllAbsBarPress()
	{
		List<AbsBarPressure> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
