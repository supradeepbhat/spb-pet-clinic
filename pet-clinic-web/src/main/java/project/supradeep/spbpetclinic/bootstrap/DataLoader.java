package project.supradeep.spbpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project.supradeep.spbpetclinic.model.Owner;
import project.supradeep.spbpetclinic.model.Vet;
import project.supradeep.spbpetclinic.services.OwnerService;
import project.supradeep.spbpetclinic.services.VetService;
import project.supradeep.spbpetclinic.services.map.OwnerServiceMap;
import project.supradeep.spbpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jack");
        owner1.setLastName("Sparrow");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Taylor");
        owner2.setLastName("Durden");

        ownerService.save(owner2);

        System.out.println("Owners loaded.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Kent");
        vet1.setLastName("Clark");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Bruce");
        vet2.setLastName("Wayne");

        vetService.save(vet2);

        System.out.println("Vets loaded.....");
    }
}
