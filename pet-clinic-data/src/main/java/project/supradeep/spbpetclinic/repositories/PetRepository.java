package project.supradeep.spbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import project.supradeep.spbpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
