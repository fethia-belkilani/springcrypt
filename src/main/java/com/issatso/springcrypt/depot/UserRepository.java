package com.issatso.springcrypt.depot;

import com.issatso.springcrypt.entites.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User,Integer> {

    Optional<User> findByUsername(String username);

}