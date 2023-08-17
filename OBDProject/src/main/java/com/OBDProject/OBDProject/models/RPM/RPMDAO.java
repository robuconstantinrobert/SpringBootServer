package com.OBDProject.OBDProject.models.RPM;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class RPMDAO {
	
	@Autowired
	private RPMRepository repository;
	
	public List<RPM> getAllRPMValues()
	{
		List<RPM> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
