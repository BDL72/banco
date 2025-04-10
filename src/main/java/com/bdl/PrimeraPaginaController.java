package com.bdl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")

public class PrimeraPaginaController {
	
	
	@GetMapping("/bemvindo")
	public String bemVindo() {
		return "bem vindo ao bamco";
	}
	
	@GetMapping("/vem")
	public String vem() {
		return new String("Ele e bom");
	}
	

}
