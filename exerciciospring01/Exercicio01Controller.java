package br.org.generation.exerciciospring01.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio01")
public class Exercicio01Controller {
	
	@GetMapping
	public String exercicio01 () {
		return "Atenção aos detalhes e Persistência.";
	}

}
