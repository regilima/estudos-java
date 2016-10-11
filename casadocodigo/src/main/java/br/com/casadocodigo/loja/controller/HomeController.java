package br.com.casadocodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
    public String index(){
		System.out.println("Entrando na home da CDC");
	    return "home";
    }
	
	@RequestMapping("/produtos/form")
    public String form(){
        return "produtos/form";
    }
	
	@RequestMapping("/produtos")
	public String gravar(String titulo, String descricao, int paginas){
	    System.out.println(titulo);
	    System.out.println(descricao);
	    System.out.println(paginas);

	    return "ok";
	}
	
	
}
