package project.supradeep.spbpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project.supradeep.spbpetclinic.model.Owner;
import project.supradeep.spbpetclinic.model.PetType;
import project.supradeep.spbpetclinic.model.Vet;
import project.supradeep.spbpetclinic.services.OwnerService;
import project.supradeep.spbpetclinic.services.PetTypeService;
import project.supradeep.spbpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType hamster = new PetType();
        dog.setName("Hamster");
        PetType savedHamsterPetType = petTypeService.save(hamster);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jack");
        owner1.setLastName("Sparrow");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Taylor");
        owner2.setLastName("Durden");

        ownerService.save(owner2);

        System.out.println("Owners loaded.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Kent");
        vet1.setLastName("Clark");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Bruce");
        vet2.setLastName("Wayne");

        vetService.save(vet2);

        System.out.println("Vets loaded.....");
    }
}
