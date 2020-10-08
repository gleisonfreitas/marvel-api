package com.api.marvel.integracao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.api.marvel.domain.model.Characther;
import com.api.marvel.domain.model.exception.EntidadeNaoExisteException;
import com.api.marvel.repository.CharactherRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MarvelApiApplicationTestsIntegracao {

	@Autowired
	private CharactherRepository charactherRepository;
	
	@Test
	public void testarChamadaDeTodosCharacters() {
		
		List<Characther> characters = charactherRepository.findAll();
		
		assertThat(characters).isNotEmpty();
	}
	
	@Test
	public void testarChamadaDeCharacterPorId() {
		
		Characther characther = charactherRepository.findById(1L).get();
		
		assertThat(characther.getId()).isEqualTo(1L);
	}
	
	@Test(expected=EntidadeNaoExisteException.class)
	public void testarChamadaDeUmCharacterQueNaoExiste() {
		
		charactherRepository.findById(1000L);
	}

}
