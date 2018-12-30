package com.example.me.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avaria {
	
	@Id
	@GeneratedValue
    private Long id;
	private OrdemServico ordemServico;
	private String descricaoAvaria;
	private User usuario;
	private Date dataAvaria;
	
	public Avaria(OrdemServico ordemServico, String descricaoAvaria, User usuario, Date dataAvaria) {
		this.ordemServico = ordemServico;
		this.descricaoAvaria = descricaoAvaria;
		this.usuario = usuario;
		this.dataAvaria = dataAvaria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public OrdemServico getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}
	public String getDescricaoAvaria() {
		return descricaoAvaria;
	}
	public void setDescricaoAvaria(String descricaoAvaria) {
		this.descricaoAvaria = descricaoAvaria;
	}
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public Date getDataAvaria() {
		return dataAvaria;
	}
	public void setDataAvaria(Date dataAvaria) {
		this.dataAvaria = dataAvaria;
	}
	
	@Override
	public String toString() {
		return "Avaria [id=" + id + ", ordemServico=" + ordemServico + ", descricaoAvaria=" + descricaoAvaria
				+ ", usuario=" + usuario + ", dataAvaria=" + dataAvaria + "]";
	}
	
}
