package com.example.revisao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //habilita a classe a receber requisições http.
@RequestMapping("/rotas") //permite que a gente mapeie uma rota para esta classe e ou método.
public class Rotas {

    private List<String> nomes = new ArrayList<>();

	@GetMapping
	public List<String> ola(){
		return nomes;
	}

    @PostMapping
    public String salvarNomeNaLista(@RequestBody String nome) {
        nomes.add(nome);
        return "Nome " + nome + " adicionado com sucesso!";
    }

}
