package com.OBDProject.OBDProject.models.TimingAdvance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class TimingAdvanceDAO {
	
	@Autowired
	private TimingAdvanceRepository repository;
	
	public List<TimingAdvance> getAllTimingValues()
	{
		List<TimingAdvance> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
