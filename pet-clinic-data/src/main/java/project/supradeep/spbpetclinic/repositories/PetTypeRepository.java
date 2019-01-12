package project.supradeep.spbpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import project.supradeep.spbpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
