package com.example.me.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrdemServico {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nomeCliente;
	private String enderecoCliente;
	private String telefoneCliente;
	private String emailCliente;
	private String tipoEquipamento;
	private String marcaEquipamento;
	private String descricaoProblema;
	private String statusOrdemServico;
	
	
	public OrdemServico() {
		super();
	}

	public OrdemServico(String nomeCliente, String enderecoCliente, String telefoneCliente,
			String emailCliente, String tipoEquipamento, String marcaEquipamento, String descricaoProblema,
			String statusOrdemServico) {
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
		this.tipoEquipamento = tipoEquipamento;
		this.marcaEquipamento = marcaEquipamento;
		this.descricaoProblema = descricaoProblema;
		this.statusOrdemServico = statusOrdemServico;
	}

	@Override
	public String toString() {
		return "OrdemServico [id=" + id + ", nomeCliente=" + nomeCliente + ", enderecoCliente=" + enderecoCliente
				+ ", telefoneCliente=" + telefoneCliente + ", emailCliente=" + emailCliente + ", tipoEquipamento="
				+ tipoEquipamento + ", marcaEquipamento=" + marcaEquipamento + ", descricaoProblema="
				+ descricaoProblema + ", statusOrdemServico=" + statusOrdemServico + "]";
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}
	
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	public String getTipoEquipamento() {
		return tipoEquipamento;
	}
	
	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}
	
	public String getMarcaEquipamento() {
		return marcaEquipamento;
	}
	
	public void setMarcaEquipamento(String marcaEquipamento) {
		this.marcaEquipamento = marcaEquipamento;
	}
	
	public String getDescricaoProblema() {
		return descricaoProblema;
	}
	
	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}
}
