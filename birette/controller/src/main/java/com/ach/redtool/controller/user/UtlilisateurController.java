package com.ach.redtool.controller.user;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ach.redtool.service.common.ResponseDto;
import com.ach.redtool.service.dto.UtilisateurDto;
import com.ach.redtool.service.user.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/rest/user")
@Api(value="User controller")
public class UtlilisateurController {
	
	final Logger LOOGER = LoggerFactory.getLogger(UtlilisateurController.class);
	
	@Autowired
	UserService userService;
	
	@GetMapping(value="/listUsers",produces="application/json")
	@ApiOperation("get All Users")
	public ResponseEntity <List<UtilisateurDto>> getAllUser() {
		LOOGER.debug("Recupérer la liste des utilisateur");
		List<UtilisateurDto> listUser =  userService.findAllUser();
		if(listUser.isEmpty()) {
			LOOGER.debug("la liste est vide");
			return ResponseEntity.noContent().build();
		}
		LOOGER.debug("nombre d'utilisateurs trouvés {}",listUser.size());

		return ResponseEntity.ok().body(listUser);
	}
	
	@GetMapping(value="/getUser/{id}",produces="application/json")
	@ApiOperation("get user by id")
	public ResponseEntity<UtilisateurDto> getUserById(@PathVariable(value ="id") Long userId)  {
		LOOGER.debug("Recupérer l'utilisateur dont l'id = {}",userId);
		UtilisateurDto UtilisateurDto = userService.getUserById(userId);
		if(UtilisateurDto == null)
			 ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(UtilisateurDto);
	}
	
	
	@PostMapping("/createUser")
	@ApiOperation("create user")
	public UtilisateurDto createUser(@Valid @RequestBody UtilisateurDto utilisateurDto) {
		LOOGER.debug("création d'un utilisateur ");
		return userService.createUser((utilisateurDto));
	}

	
	@GetMapping(value="/deleteUser/{id}",produces="application/json")
	@ApiOperation("delete user")
	public ResponseDto deleteUser(@PathVariable(value ="id") Long userId) {
		LOOGER.debug("delete user id = {}",userId);
		return userService.deleteUser(userId);
	}
	
	@PutMapping(value="/updateUser",produces="application/json")
	@ApiOperation("update user")
	public ResponseEntity<ResponseDto> updateUser(@Valid @RequestBody UtilisateurDto utilisateurDto)  {
		LOOGER.debug("Recupérer l'utilisateur dont l'id = {}",utilisateurDto.getId());
		ResponseDto responseDto = userService.updateUser(utilisateurDto);
		return ResponseEntity.ok().body(responseDto);
	}

}
