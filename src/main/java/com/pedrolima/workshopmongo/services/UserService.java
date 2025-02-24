package com.pedrolima.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrolima.workshopmongo.domain.User;
import com.pedrolima.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired //mecanismo de injeção de dependencia automatica do spring
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
}
