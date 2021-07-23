package br.org.generation.exerciciospring02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio02")
public class Exercicio02Controller {
	
	@GetMapping
	public String exercicio02 () {
		return "Conseguir executar aplicações com o Spring. Realizar exercícios para melhor absorção dos comandos.";
	}
	

}
