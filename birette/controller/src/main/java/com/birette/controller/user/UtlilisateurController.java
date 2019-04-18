package com.birette.controller.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birette.service.dto.UtilisateurDto;
import com.birette.service.user.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/user")
@Api(value="User controller")
public class UtlilisateurController {
	
	final Logger LOOGER = LoggerFactory.getLogger(UtlilisateurController.class);
	
	@Autowired
	UserService userService;
	
	@ApiOperation("get All Users")
	@GetMapping(value="/listUsers",produces="application/json")
	public List <UtilisateurDto> getAllUser() {
		LOOGER.debug("Recupérer la liste des utilisateur");
		List<UtilisateurDto> listUser =  userService.findAllUser();
		if(listUser.isEmpty())
			LOOGER.debug("la liste est vide");
		LOOGER.debug("nombre d'utilisateurs trouvés {}",listUser.size());
		return listUser;
	}

}
