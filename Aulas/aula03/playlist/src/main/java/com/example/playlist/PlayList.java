package com.example.playlist;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Musica> musicas = new ArrayList<>();

    public PlayList() {
        musicas.add(new Musica(1, "Eu não sou boa influência para você", 180, true));
        musicas.add(new Musica(2, "Velha infância", 180, true));
        musicas.add(new Musica(3, "Bad Romance", 300, false));
    }

    
    public List<Musica> getMusicas() {
        return this.musicas;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }
}
