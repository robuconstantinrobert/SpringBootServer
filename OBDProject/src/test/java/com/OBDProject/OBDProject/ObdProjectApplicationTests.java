package com.OBDProject.OBDProject;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.OBDProject.OBDProject.models.AbsBarPressure.AbsBarPressure;
import com.OBDProject.OBDProject.models.AbsBarPressure.AbsBarPressureDAO;

@SpringBootTest
class ObdProjectApplicationTests {

	@Autowired
	private AbsBarPressureDAO controller;
	
	@Test
	void getAllAbsBarPress() {
		Iterable<AbsBarPressure> list = controller.getAllAbsBarPress();
		System.out.println(list);
	}
}
