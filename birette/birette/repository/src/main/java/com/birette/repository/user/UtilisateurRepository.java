package com.birette.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birette.repository.entity.User;

@Repository
public interface UtilisateurRepository  extends JpaRepository<User, Long>{
	
	User findByNom(String nom);

}
