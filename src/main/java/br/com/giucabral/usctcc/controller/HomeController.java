package br.com.giucabral.usctcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/teste")
	public String execute() {
		return "ok";
	}

}
