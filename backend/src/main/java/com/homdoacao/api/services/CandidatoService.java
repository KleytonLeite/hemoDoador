package com.homdoacao.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homdoacao.api.dto.CandidatoDTO;
import com.homdoacao.api.entities.Candidato;
import com.homdoacao.api.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository repository;
	
	
	
	@Transactional
	public CandidatoDTO insert(CandidatoDTO dto) {
		
		Candidato entity = new Candidato();
		
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setRg(dto.getRg());
		entity.setData_nasc(dto.getData_nasc());
		entity.setSexo(dto.getSexo());
		entity.setMae(dto.getMae());
		entity.setPai(dto.getPai());
		entity.setEmail(dto.getEmail());
		entity.setCep(dto.getCep());
		entity.setEndereco(dto.getEndereco());
		entity.setNumero((Integer) dto.getNumero());
		entity.setBairro(dto.getBairro());
		entity.setCidade(dto.getCidade());
		entity.setEstado(dto.getEstado());
		entity.setTelefone_fixo(dto.getTelefone_fixo());
		entity.setCelular(dto.getCelular());
		entity.setAltura(dto.getAltura());
		entity.setPeso(dto.getPeso());
		entity.setTipo_sanguineo(dto.getTipo_sanguineo());
		
		entity = repository.save(entity);
		return new CandidatoDTO(entity);
	}

	public Page<CandidatoDTO> findByPaged(Object object, Object object2, PageRequest pageRequest) {
		return repository.findByPaged(pageRequest).map(x -> new CandidatoDTO(x));
	}
		
}
