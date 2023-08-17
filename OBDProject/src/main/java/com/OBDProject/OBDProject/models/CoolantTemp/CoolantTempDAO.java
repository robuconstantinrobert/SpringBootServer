package com.OBDProject.OBDProject.models.CoolantTemp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class CoolantTempDAO {
	
	@Autowired
	private CoolantTempRepository repository;
	
	public List<CoolantTemp> getAllCoolantValues()
	{
		List<CoolantTemp> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
