package com.bdl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")

public class PrimeraPaginaController {
	
	
	@GetMapping("/bemvindo")
	public String bemVindo() {
		return "bem vindo ao bamco";
	}
	

}
