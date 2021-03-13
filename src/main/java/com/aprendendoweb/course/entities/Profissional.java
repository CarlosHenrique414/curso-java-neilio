package com.aprendendoweb.course.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.smartclinmed.web.domain.Endereco;
import br.com.smartclinmed.web.domain.Indicacao;


public class Profissional implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "inquilino_id")
	private Inquilino inquilino;
	
	private String nome;
	private String sexo;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String uf;
	private String email;
	private String numeroConsenho;
	private String assinatura;
	private String status;

	@ManyToOne
	@JoinColumn(name = "indicacao_id")
	private Indicacao indicacao;

	private LocalDateTime dtInclusao;
	private LocalDateTime dtAlteracao;

	@ManyToOne
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	@ElementCollection
	@CollectionTable(name = "TELEFONE_PACIENTE")
	private Set<String> telefones = new HashSet<>();


	public Profissional() {
	}


	public Profissional(Long id, Inquilino inquilino, String nome, String sexo, String cpf, String rg,
			String dataNascimento, String uf, String email, String numeroConsenho, String assinatura, String status,
			com.aprendendoweb.course.entities.Indicacao indicacao, LocalDateTime dtInclusao, LocalDateTime dtAlteracao,
			com.aprendendoweb.course.entities.Endereco endereco, Set<String> telefones) {
		super();
		this.id = id;
		this.inquilino = inquilino;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.uf = uf;
		this.email = email;
		this.numeroConsenho = numeroConsenho;
		this.assinatura = assinatura;
		this.status = status;
		this.indicacao = indicacao;
		this.dtInclusao = dtInclusao;
		this.dtAlteracao = dtAlteracao;
		this.endereco = endereco;
		this.telefones = telefones;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Inquilino getInquilino() {
		return inquilino;
	}


	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
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


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNumeroConsenho() {
		return numeroConsenho;
	}


	public void setNumeroConsenho(String numeroConsenho) {
		this.numeroConsenho = numeroConsenho;
	}


	public String getAssinatura() {
		return assinatura;
	}


	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Indicacao getIndicacao() {
		return indicacao;
	}


	public void setIndicacao(Indicacao indicacao) {
		this.indicacao = indicacao;
	}


	public LocalDateTime getDtInclusao() {
		return dtInclusao;
	}


	public void setDtInclusao(LocalDateTime dtInclusao) {
		this.dtInclusao = dtInclusao;
	}


	public LocalDateTime getDtAlteracao() {
		return dtAlteracao;
	}


	public void setDtAlteracao(LocalDateTime dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Set<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profissional other = (Profissional) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
