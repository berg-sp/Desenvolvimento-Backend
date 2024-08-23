package com.example.revisao.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.revisao.model.Instrumento;

public class InstrumentoRepository {

    private List<Instrumento> instrumentos = new ArrayList<>();

    public InstrumentoRepository() {
        instrumentos.add(new Instrumento(1, "Trompete", new BigDecimal(2499.99)));
        instrumentos.add(new Instrumento(2, "Guitarra", new BigDecimal(3279.90)));
    }

    public void save(Instrumento instrumento) {
        instrumentos.add(instrumento);   
    }

    public List<Instrumento> getAll() {
        return instrumentos;
    }

}
