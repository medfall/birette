package com.ach.redtool.service.user;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ach.redtool.repository.entity.UtilisateurEntity;
import com.ach.redtool.repository.user.UtilisateurRepository;
import com.ach.redtool.service.common.MessageDto;
import com.ach.redtool.service.common.ResponseDto;
import com.ach.redtool.service.converter.UtilisateurConverter;
import com.ach.redtool.service.dto.UtilisateurDto;



@Service
public class  UserServiceImpl  implements UserService {
	
	@Autowired
	UtilisateurRepository userRepository;
	
	@Autowired
	UtilisateurConverter utilisateurConverter;

	@Override
	public List<UtilisateurDto> findAllUser () {
		List<UtilisateurEntity> utilisateurEntities = (List<UtilisateurEntity>) userRepository.findAll();
		return utilisateurEntities.stream().map(utilisateurConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public UtilisateurDto getUserById(Long id) {
		Optional<UtilisateurEntity> utilisateurEntity = userRepository.findById(id);
		if(utilisateurEntity.isPresent())
			return utilisateurConverter.convertToDTO(utilisateurEntity.get());
		return null;
	}

	@Override
	public UtilisateurDto createUser(UtilisateurDto utilisateurDto) {
		UtilisateurEntity utilisateurEntity = utilisateurConverter.convertToEntity(utilisateurDto);
		utilisateurEntity= userRepository.save(utilisateurEntity);
		return  utilisateurConverter.convertToDTO(utilisateurEntity);
	}
	
	@Override
	public ResponseDto updateUser(UtilisateurDto utilisateurDto) {
		
		ResponseDto response = new ResponseDto();
		Optional<UtilisateurEntity> utilisateurEntity = userRepository.findById(utilisateurDto.getId());
		if(utilisateurEntity.isPresent()) {
		    UtilisateurEntity user = utilisateurConverter.convertToEntity(utilisateurDto);
			userRepository.save(user);
			response.addMessage(new MessageDto("vos modifications ont été enregistrées succées"));
			return response;
		}
	    response.addMessage(new MessageDto("un probleme est survenu lors de la modification"));
		return response;
	}
	
	@Override
	public ResponseDto deleteUser(Long id) {
		ResponseDto response = new ResponseDto();
		Optional<UtilisateurEntity> utilisateurEntity = userRepository.findById(id);
		if(utilisateurEntity.isPresent()) {
			userRepository.deleteById(id);
			response.addMessage(new MessageDto("Utilisateur supprimé avec succées"));
			return response;
		}
	    response.addMessage(new MessageDto("l'utilisateur n'existe pas"));
		return response;
	}

}
