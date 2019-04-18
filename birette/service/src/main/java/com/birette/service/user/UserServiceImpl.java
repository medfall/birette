package com.birette.service.user;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birette.repository.entity.UtilisateurEntity;
import com.birette.repository.user.UtilisateurRepository;
import com.birette.service.converter.UtilisateurConverter;
import com.birette.service.dto.UtilisateurDto;



@Service
public class  UserServiceImpl  implements UserService {
	
	@Autowired
	UtilisateurRepository userRepository;
	
	@Autowired
	UtilisateurConverter utilisateurConverter;

	@Override
	public List<UtilisateurDto> findAllUser () {
		List<UtilisateurEntity> utilisateurEntities = (List<UtilisateurEntity>) userRepository.findAll();
	    List<UtilisateurDto> utilisateurDtos = utilisateurEntities.stream().map(utilisateurConverter::convertToDTO).collect(Collectors.toList());
	    return utilisateurDtos;
	}
	
}
