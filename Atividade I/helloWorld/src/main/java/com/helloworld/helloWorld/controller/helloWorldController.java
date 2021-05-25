package com.helloworld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class helloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Alexsander Sousa"
				+ "\n------------------"
				+ "\nMentalidades: Mentalidade de crescimento e persistência."
				+ "\nHabilidades: Atenção ao detalhe, comunicação e trabalho em equipe.\n";
	}

}