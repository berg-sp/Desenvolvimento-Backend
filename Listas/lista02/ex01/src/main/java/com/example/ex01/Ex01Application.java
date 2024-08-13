package com.example.ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {
	private static List<IlhaDeCalor> ilhasList = new ArrayList<>();

	@GetMapping("/listaIlhaDeCalor")
	public List<IlhaDeCalor> getIlhaDeCalors() {
		return ilhasList;
	}

	@PostMapping
	public static String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor ilhaDeCalor) {
		for(IlhaDeCalor ilhaDeCalorNaLista : ilhasList) {
			if (ilhaDeCalor.getId() == ilhaDeCalorNaLista.getId()) {
				return "Ilha de calor já exite";
			}
		}
		ilhasList.add(ilhaDeCalor);
		return "Ilha de calor " + ilhaDeCalor.getBairro() + "incluído com sucesso!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
		ilhasList.add(new IlhaDeCalor(1, "Itaquera", "Leste"));
		ilhasList.add(new IlhaDeCalor(2, "Campo Limpo", "Sul"));
	}
}
