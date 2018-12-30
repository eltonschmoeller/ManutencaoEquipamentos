package com.example.me.controllers;
import java.util.List;
import java.util.Optional;

import com.example.me.entities.OrdemServico;
import com.example.me.repositories.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class OrdermServicoController {
	@Autowired
	private OrdemServicoRepository orderServicoRepository;

	@GetMapping("/ordens")
	public List<OrdemServico> getOrdens() {
		return orderServicoRepository.findAll();
	}

	@GetMapping("/ordemServico/{id}")
	public Optional<OrdemServico> getOrdemServico(@PathVariable Long id) {
		return orderServicoRepository.findById(id);
	}

	@DeleteMapping("/ordemServico/{id}")
	public boolean deleteOrdemServico(@PathVariable Long id) {
		orderServicoRepository.deleteById(id);
		return true;
	}

	@PutMapping("/ordemServico")
	public OrdemServico updateOrdemServico(@RequestBody OrdemServico ordemServico) {
		return orderServicoRepository.save(ordemServico);
	}

	@PostMapping("/ordemServico")
	public OrdemServico createORdemServico(@RequestBody OrdemServico ordemServico) {
		return orderServicoRepository.save(ordemServico);
	}

}