package com.birette.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.birette.repository.entity.UtilisateurEntity;

@Repository
public interface UtilisateurRepository  extends JpaRepository<UtilisateurEntity, Long>{
	
	UtilisateurEntity findByNom(String nom);
	List<UtilisateurEntity> findAll();

}
