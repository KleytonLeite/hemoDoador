package com.homdoacao.api.dto;

import java.io.Serializable;

import com.homdoacao.api.entities.Candidato;

public class CandidatoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String cpf;
	private String rg;
	private String data_nasc;
	private String sexo;
	private String mae;
	private String pai;
	private String email;
	private String cep;
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone_fixo;
	private String celular;
	private Float altura;
	private int peso;
	private String tipo_sanguineo;

	public CandidatoDTO() {

	}

	public CandidatoDTO(Candidato entity) {

		id = entity.getId();
		nome = entity.getNome();
		cpf = entity.getCpf();
		rg = entity.getRg();
		data_nasc = entity.getData_nasc();
		sexo = entity.getSexo();
		mae = entity.getMae();
		pai = entity.getPai();
		email = entity.getEmail();
		cep = entity.getCep();
		endereco = entity.getEndereco();
		numero = entity.getNumero();
		bairro = entity.getBairro();
		cidade = entity.getCidade();
		estado = entity.getEstado();
		telefone_fixo = entity.getTelefone_fixo();
		celular = entity.getCelular();
		altura = entity.getAltura();
		peso = entity.getPeso();
		tipo_sanguineo = entity.getTipo_sanguineo();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone_fixo() {
		return telefone_fixo;
	}

	public void setTelefone_fixo(String telefone_fixo) {
		this.telefone_fixo = telefone_fixo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}

	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}

}
