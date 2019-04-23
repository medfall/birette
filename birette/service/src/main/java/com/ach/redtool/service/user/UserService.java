package com.ach.redtool.service.user;

import java.util.List;

import com.ach.redtool.service.common.ResponseDto;
import com.ach.redtool.service.dto.UtilisateurDto;


public interface UserService {

	 List<UtilisateurDto> findAllUser ();
	 UtilisateurDto getUserById(Long id);
	 UtilisateurDto createUser(UtilisateurDto dto);
	 public  ResponseDto deleteUser(Long id);
	 ResponseDto updateUser(UtilisateurDto utilisateurDto);
	 
	
}
