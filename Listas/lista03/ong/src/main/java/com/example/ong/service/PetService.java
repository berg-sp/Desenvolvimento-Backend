package com.example.ong.service;

import java.util.List;

import com.example.ong.model.Pet;
import com.example.ong.repository.PetRepository;

public class PetService {
    private PetRepository repository = new PetRepository();

    public List<Pet> listarPets() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet) throws Exception {
        if (repository.save(pet)) {
            return "Pet " + pet.getNome() + " foi cadastrado com sucesso";
        }
        return "Pet devem ter ID único";
    }

}
