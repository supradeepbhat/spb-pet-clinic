package project.supradeep.spbpetclinic.services;

import project.supradeep.spbpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
