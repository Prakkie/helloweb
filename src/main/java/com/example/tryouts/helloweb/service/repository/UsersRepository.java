package com.example.tryouts.helloweb.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tryouts.helloweb.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	List<Users> findByName(String name);
	List<Users> findByAge(int age);
}
