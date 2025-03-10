package com.pedrolima.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrolima.workshopmongo.domain.Post;
import com.pedrolima.workshopmongo.repository.PostRepository;
import com.pedrolima.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired //mecanismo de injeção de dependencia automatica do spring
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
