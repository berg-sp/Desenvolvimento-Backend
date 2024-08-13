package com.example.playlist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/aplicacao")
public class PlaylistApplication {

	private PlayList playList = new PlayList();

	@GetMapping
	public List<Musica> getMusicas() {
		return playList.getMusicas();
	}

	@GetMapping("/favoritadas")
	public List<Musica> getMusicasFavoritadas() {
		List<Musica> favoritadas = new ArrayList<>();

		for (Musica musica : playList.getMusicas()) {
			if (musica.isEstaFavoritada()) {
				favoritadas.add(musica);
			}
		}
		return favoritadas;
	}

	@PostMapping
	public String adicionarMusica(@RequestBody Musica musica) {
		for (Musica musicaNaPlayList : playList.getMusicas()) {
			if (musica.getId() == musicaNaPlayList.getId()) {
				return "A musica esta na playlist";
			}
		}
		playList.adicionarMusica(musica);
		return "Música incluída com sucesso	";
	}

	public static void main(String[] args) {
		SpringApplication.run(PlaylistApplication.class, args);
	}

}
