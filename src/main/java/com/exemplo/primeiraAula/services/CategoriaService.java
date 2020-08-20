package com.exemplo.primeiraAula.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.primeiraAula.domain.Categoria;
import com.exemplo.primeiraAula.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null); 

		
	}

}
