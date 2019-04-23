package com.ach.redtool.repository.user;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ach.redtool.repository.entity.UtilisateurEntity;

@Repository
public interface UtilisateurRepository  extends CrudRepository<UtilisateurEntity, Long>{
	
	UtilisateurEntity findByNom(String nom);
	List<UtilisateurEntity> findAll();

}
