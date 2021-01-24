package com.homdoacao.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homdoacao.api.dto.CandidatoDTO;
import com.homdoacao.api.services.CandidatoService;

@RestController
@RequestMapping(value = "/candidatos")
public class CandidatoController {
	
	@Autowired
	private CandidatoService service;
	
	@PostMapping
	public ResponseEntity<CandidatoDTO> insert(@RequestBody CandidatoDTO dto){
		CandidatoDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
	
	@GetMapping
	public ResponseEntity<Page<CandidatoDTO>> findAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "estado") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {
		
		if (linesPerPage == 0) {
			linesPerPage = Integer.MAX_VALUE;
		}
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		Page<CandidatoDTO> list = service.findByPaged(null, null, pageRequest);
		return ResponseEntity.ok().body(list);
	}
}
