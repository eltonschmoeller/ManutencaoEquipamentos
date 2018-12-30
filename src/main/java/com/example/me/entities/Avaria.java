package com.example.me.entities;

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
	
	

}
