package br.com.giucabral.usctcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.giucabral.usctcc.model.Cliente;

@Controller
public class ClienteController {

	@RequestMapping("/cliente")
	public String index() {
		return "cliente/list";
	}
	
	@RequestMapping("/cliente/adicionar")
	public String adicionar(Cliente cliente) {
		return "cliente/form";
	}
	
	@RequestMapping("/cliente/editar")
	public String editar(Cliente cliente) {
		return "cliente/form";
	}	
	
}
