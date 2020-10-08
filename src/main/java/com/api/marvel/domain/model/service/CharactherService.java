package com.api.marvel.domain.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marvel.domain.model.Characther;
import com.api.marvel.domain.model.exception.EntidadeNaoExisteException;
import com.api.marvel.repository.CharactherRepository;

@Service
public class CharactherService {
	
	@Autowired
	private CharactherRepository charactherRepository;
	
	public Characther buscarPorId(Long id) {
		Optional<Characther> optional = charactherRepository.findById(id);
		return optional.orElseThrow(
				() -> new EntidadeNaoExisteException("Character com o id "+id+" não foi encontrado."));
	}

}
