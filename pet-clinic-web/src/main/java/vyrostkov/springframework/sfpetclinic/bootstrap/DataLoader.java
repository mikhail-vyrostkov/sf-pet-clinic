package vyrostkov.springframework.sfpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vyrostkov.springframework.sfpetclinic.model.*;
import vyrostkov.springframework.sfpetclinic.services.*;

import java.time.LocalDate;

/**
 * Created by @m.vyrostkov on 19.08.2022 12:25
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService1, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService1;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            LoadData();
        }
    }

    private void LoadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Dog");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiolagy");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mikhail");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("192992827");

        Pet mikesDog = new Pet();
        mikesDog.setName("Rosco");
        mikesDog.setPetType(savedDogPetType);
        mikesDog.setOwner(owner1);
        mikesDog.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesDog);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Elon");
        owner2.setLastName("Mask");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("122277338");


        Pet elonCat = new Pet();
        elonCat.setName("Holland");
        elonCat.setPetType(savedCatPetType);
        elonCat.setOwner(owner2);
        elonCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(elonCat);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(elonCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneeze Kitty");
        visitService.save(catVisit);


        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet1.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Micheal");
        vet3.setLastName("Vyrostkov");
        vet1.getSpecialities().add(savedDentistry);
        vetService.save(vet3);

        System.out.println("Loaded Vets.....");
    }
}
