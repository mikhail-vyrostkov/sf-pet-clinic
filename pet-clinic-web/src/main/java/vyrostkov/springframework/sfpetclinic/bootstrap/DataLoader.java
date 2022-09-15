package vyrostkov.springframework.sfpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vyrostkov.springframework.sfpetclinic.model.Owner;
import vyrostkov.springframework.sfpetclinic.model.PetType;
import vyrostkov.springframework.sfpetclinic.model.Vet;
import vyrostkov.springframework.sfpetclinic.services.OwnerService;
import vyrostkov.springframework.sfpetclinic.services.PetTypeService;
import vyrostkov.springframework.sfpetclinic.services.VetService;

/**
 * Created by @m.vyrostkov on 19.08.2022 12:25
 */
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
        cat.setName("Dog");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mikhail");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Elon");
        owner2.setLastName("Mask");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Micheal");
        vet3.setLastName("Vyrostkov");

        vetService.save(vet3);

        System.out.println("Loaded Vets.....");

    }
}
