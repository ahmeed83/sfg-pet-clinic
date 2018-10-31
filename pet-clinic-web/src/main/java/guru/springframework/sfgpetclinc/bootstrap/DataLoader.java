package guru.springframework.sfgpetclinc.bootstrap;

import guru.springframework.sfgpetclinc.model.Owner;
import guru.springframework.sfgpetclinc.model.Vet;
import guru.springframework.sfgpetclinc.service.OwnerService;
import guru.springframework.sfgpetclinc.service.VetService;
import guru.springframework.sfgpetclinc.service.map.OwnerServiceMap;
import guru.springframework.sfgpetclinc.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(final String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ahmed");
        owner1.setLastName("Aziz");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Hayder");
        owner2.setLastName("Aziz");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Stijn");
        vet2.setLastName("Bakker");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
