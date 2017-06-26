package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Human;
import com.repository.HumanCharacteristics;

@Service("humanService")
public class HumanServiceImpl implements HumanService {
	@Autowired
	private HumanCharacteristics hc;
	
	@Override
	public List<Human> ReturnAllHumanCharacteristics() {
		return hc.getAllHumanCharacteristics();
	}

}
