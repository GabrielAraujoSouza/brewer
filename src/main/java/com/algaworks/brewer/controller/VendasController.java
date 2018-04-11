package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendasController {

	@GetMapping("/vendas/nova")
	public String novo(){
		return "venda/CadastroVenda";
	}
}
