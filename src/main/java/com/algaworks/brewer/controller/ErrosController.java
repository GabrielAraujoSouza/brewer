package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrosController {

	@GetMapping("/404")
	public String paginaNaoEncontrada(){
		return "404";
	}
	
	@RequestMapping(value = "/500")
	public ModelAndView erroServidor() {
		return new ModelAndView("500");
	}
}
