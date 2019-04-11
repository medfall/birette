package com.birette.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birette.service.dto.UtilisateurDto;
import com.birette.service.user.UserService;


@RestController
@RequestMapping("/user")
public class UtlilisateurController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(name="listUsers",produces="json")
	public List <UtilisateurDto> getAllUser() {
		return userService.findAllUser();
	}

}
