package com.example.tryouts.helloweb.resource;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.tryouts.helloweb.model.Users;
import com.example.tryouts.helloweb.service.repository.UsersRepository;

@Resource
@RestController
@RequestMapping(value="/api//users")
public class UsersResource {
	
	@Autowired
	private UsersRepository usersRepository;

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public List<Users> addUsers(@RequestBody final Users users ) {
		List<Users> usersList = Arrays.asList(users);
		return usersRepository.saveAll(usersList);
	}
	
	@GetMapping("/all")
	public List<Users> getUsers() {
		//return usersRepository.findAll();
		//return usersRepository.findAll(Sort.by("id"));
		return usersRepository.findAll(Sort.by("id").descending());
		//return usersRepository.findAll(Sort.by("name"));
	}
 	
	@GetMapping("/name/{name}")
	public List<Users> lookByName(@PathVariable final String name) {
		return usersRepository.findByName(name);		
	}
	
	@GetMapping("/age/{age}")
	public List<Users> lookByAge(@PathVariable final int age) {
		return usersRepository.findByAge(age);		
	}
	
}
