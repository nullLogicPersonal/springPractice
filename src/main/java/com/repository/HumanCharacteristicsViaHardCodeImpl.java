package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Gender;
import com.model.Human;

@Repository("humanCharacteristics")
public class HumanCharacteristicsViaHardCodeImpl implements HumanCharacteristics{

	@Override
	public List<Human> getAllHumanCharacteristics() {
		List<Human> humans = new ArrayList<>();
		Human human = new Human();
		human.setAge(28);
		human.setGender(Gender.MALE);
		humans.add(human);
		return humans;
		
	}
	
}
