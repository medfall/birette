package com.ach.redtool.repository.user;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UtilisateurRespositoryTest {
	/*
	
	
	@Autowired
	private TestEntityManager entityManager;
	 
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Test
	public void  testfindUserByName() {
		
		List<UtilisateurEntity> list = utilisateurRepository.findAll();
		list.stream().forEach(user->{
			System.out.println(user.getId());
			System.out.println(user.getNom());
			System.out.println(user.getPrenom());
		});
		assertTrue(list.isEmpty());
	}
	
	@Test
	public void  SaveUser() {
		
		UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
		utilisateurEntity.setId(3);
		utilisateurEntity.setNom("test");
		utilisateurEntity.setPrenom("test1");
		
		utilisateurRepository.save(utilisateurEntity);
		
		Optional<UtilisateurEntity> found = utilisateurRepository.findById(utilisateurEntity.getId());
		assertTrue(found.isPresent());
	}
	
	*/
	
	@Test
	public void  test() {
		assertTrue(true);
	}
}
