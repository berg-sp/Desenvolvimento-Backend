package com.example.revisao.service;

import java.util.List;

import com.example.revisao.model.Instrumento;
import com.example.revisao.repository.InstrumentoRepository;

public class InstrumentoService {
    private InstrumentoRepository repository = new InstrumentoRepository();

    public String cadastrarInstrumento(Instrumento instrumento) {
        for(Instrumento instrumentoNaLista : repository.getAll()) {
            if (instrumento.getId() == instrumentoNaLista.getId()) {
                return "Id já cadastrado...";
            }
        }
        repository.save(instrumento);
        return "Instrumento " + instrumento.getNome() + " cadastrdo com sucesso!";
    }

    public List<Instrumento> obterInstrumentosCadastrados(){
        return repository.getAll();
    }
}
