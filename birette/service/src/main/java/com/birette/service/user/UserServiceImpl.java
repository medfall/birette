package com.birette.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.birette.repository.entity.User;
import com.birette.repository.user.UtilisateurRepository;


public class  UserServiceImpl  implements UserService {
	
	@Autowired
	UtilisateurRepository userRepository;

	public List<User> findAllUser () {
		return (List<User>) userRepository.findAll();
	}
	
}
