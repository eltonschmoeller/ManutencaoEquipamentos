package com.example.me;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.me.entities.OrdemServico;
import com.example.me.entities.User;
import com.example.me.repositories.OrdemServicoRepository;
import com.example.me.repositories.UserRepository;

@SpringBootApplication
public class ManutencaoEquipamentosApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManutencaoEquipamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one", "one"));
		userRepository.save(new User("two", "one"));
		userRepository.save(new User("three", "one"));

		ordemServicoRepository.save(new OrdemServico("João dos Santos", "Av. Centenário - Centro", "(48) 91234 5678",
				"eltonschmoeller@gmail.com", "Geladeira", "Consul", "Não liga a luz interna.", "Novo"));
	}

}
