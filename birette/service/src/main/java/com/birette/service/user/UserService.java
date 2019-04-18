package com.birette.service.user;

import java.util.List;

import com.birette.service.common.ResponseDto;
import com.birette.service.dto.UtilisateurDto;


public interface UserService {

	 List<UtilisateurDto> findAllUser ();
	 UtilisateurDto getUserById(Long id);
	 UtilisateurDto createUser(UtilisateurDto dto);
	 public  ResponseDto deleteUser(Long id);
	 ResponseDto updateUser(UtilisateurDto utilisateurDto);
	 
	
}
