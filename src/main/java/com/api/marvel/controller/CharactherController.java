package com.api.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.domain.model.Characther;
import com.api.marvel.domain.model.Comic;
import com.api.marvel.domain.model.Event;
import com.api.marvel.domain.model.Serie;
import com.api.marvel.domain.model.Story;
import com.api.marvel.domain.model.service.CharactherService;
import com.api.marvel.repository.CharactherRepository;

@RestController
@RequestMapping(value="/characters", produces = MediaType.APPLICATION_JSON_VALUE)
public class CharactherController {
	
	@Autowired
	private CharactherRepository charactherRepository;
	
	@Autowired
	private CharactherService charactherService;
	
	@GetMapping
	public List<Characther> listar() {
		return charactherRepository.findAll();
	}
	
	@GetMapping(path="/{characterId}")
	public ResponseEntity<Characther> buscarPoId(@PathVariable("characterId") Long id) {
		Characther characther = charactherService.buscarPorId(id);
		
		return ResponseEntity.ok(characther);
	}

	@GetMapping(path="/{characterId}/comics")
	public List<Comic> listarComicsPorCharacter(@PathVariable("characterId") Long id) {
		
		Characther characther = charactherService.buscarPorId(id);
		
		return characther.getComics();
	}
	
	@GetMapping(path="/{characterId}/events")
	public List<Event> listarEventsPorCharacter(@PathVariable("characterId") Long id) {
		
		Characther characther = charactherService.buscarPorId(id);
		
		return characther.getEvents();
	}
	
	@GetMapping(path="/{characterId}/series")
	public List<Serie> listarSeriesPorCharacter(@PathVariable("characterId") Long id) {
		
		Characther characther = charactherService.buscarPorId(id);
		
		return characther.getSeries();
	}
	
	@GetMapping(path="/{characterId}/stories")
	public List<Story> listarStoriesPorCharacter(@PathVariable("characterId") Long id) {
		
		Characther characther = charactherService.buscarPorId(id);
		
		return characther.getStories();
	}
}
