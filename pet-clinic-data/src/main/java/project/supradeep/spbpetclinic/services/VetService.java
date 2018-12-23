package project.supradeep.spbpetclinic.services;

import project.supradeep.spbpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
