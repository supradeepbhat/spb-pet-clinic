package project.supradeep.spbpetclinic.services;

import project.supradeep.spbpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
