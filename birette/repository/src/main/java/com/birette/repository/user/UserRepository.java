package com.birette.repository.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.birette.repository.entity.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Long>{

}
