package com.helloworld1.helloWorld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld1")
public class helloWorld1Controller {
	
	@GetMapping
	public String helloWorld1() {
		return "								Alexsander Sousa"
				+ "\n------------------------------------------------------------------------------------"
				+ "\nObjetivos de aprendizagem da semana:"
				+ "\n1º) Desenvolver minhas habilidades no conteúdo novo (Spring boot e postman);"
				+ "\n2º) Sanar todas as duvidas referente a matéria dada;"
				+ "\n3º) Realizar todas as atividades propostas dentro do prazo e com bom aproveitamento.";
	}
}