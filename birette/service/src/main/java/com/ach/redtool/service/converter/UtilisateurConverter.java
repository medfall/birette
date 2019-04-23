package com.ach.redtool.service.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.ach.redtool.repository.entity.UtilisateurEntity;
import com.ach.redtool.service.common.Converter;
import com.ach.redtool.service.dto.UtilisateurDto;;

@Component
public class UtilisateurConverter implements Converter<UtilisateurEntity, UtilisateurDto> {

	@Override
	public UtilisateurDto convertToDTO(UtilisateurEntity entity) {
		UtilisateurDto utilisateurDto = new UtilisateurDto();
	    BeanUtils.copyProperties(entity, utilisateurDto);
	    return utilisateurDto;
	    
	}

	@Override
	public UtilisateurEntity convertToEntity(UtilisateurDto dto) {
		UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
	    BeanUtils.copyProperties(dto, utilisateurEntity);
	    return utilisateurEntity;
	}

}
