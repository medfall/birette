package com.birette.controller.user;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birette.repository.entity.UtilisateurEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/user")
@Api(value="User controller")
public class UtlilisateurController {
	
	final Logger LOOGER = LoggerFactory.getLogger(UtlilisateurController.class);

	
	@GetMapping(value="/listUsers",produces="application/json")
	@ApiOperation("get All Users")
	public List <UtilisateurEntity> getAllUser() {
		LOOGER.debug("Recupérer la liste des utilisateur");
		List<UtilisateurEntity> listUser =  new ArrayList();
		UtilisateurEntity user = new UtilisateurEntity();
		user.setId(1);
		user.setNom("Momo");
		user.setPrenom("Fall");
		
		UtilisateurEntity user1 = new UtilisateurEntity();
		user.setId(2);
		user.setNom("med");
		user.setPrenom("diop");
		
		listUser.add(user);
		listUser.add(user1);
		
		UtilisateurEntity user3 = new UtilisateurEntity();
		user.setId(2);
		user.setNom("med");
		user.setPrenom("diop");
		
		listUser.add(user);
		listUser.add(user1);
		listUser.add(user3);
		
		return listUser;
	}

}
