package com.birette.repository.user;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.birette.repository.entity.User;

@RunWith(SpringRunner.class)
public class UtilisateurRespositoryTest {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Test
	public void  testfindUserByName() {
		
		List<User> list = utilisateurRepository.findAll();
		assertTrue(list.isEmpty());
		
	}
	
	@Test
	public void saveTest() {
		User user = new User();
		Long id = new Long(1);
		user.setId(id);
		user.setNom("med");
		user.setPrenom("fall");
		utilisateurRepository.save(user);
	}
	
	@Test
	public void  testfindUserByName2() {
		
      	assertTrue(true);	
	}
}
