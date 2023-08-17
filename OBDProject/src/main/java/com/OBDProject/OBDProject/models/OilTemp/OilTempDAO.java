package com.OBDProject.OBDProject.models.OilTemp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class OilTempDAO {
	
	@Autowired
	private OilTempRepository repository;
	
	public List<OilTemp> getAllOilValues()
	{
		List<OilTemp> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
