package com.OBDProject.OBDProject.models.UserInfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class UserInfoDAO {
	
	@Autowired
	private UserInfoRepository repository;
	
	public List<UserInfo> getAllUserValues()
	{
		List<UserInfo> list = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(list::add);
		return list;
	}
	
}
