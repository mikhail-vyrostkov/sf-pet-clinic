package vyrostkov.springframework.sfpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vyrostkov.springframework.sfpetclinic.model.Owner;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by @m.vyrostkov on 23.11.2022 18:11
 */
class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    final Long ownerId = 1L;
    final String lastName = "Misha";

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PatTypeServiceMap(), new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerServiceMap.findAll();
        assertEquals(1, owners.size());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void saveExistingId() {
        Long ownerId2 = 2L;
        Owner savedOwner = ownerServiceMap.save(Owner.builder().id(ownerId2).build());
        assertEquals(ownerId2, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerServiceMap.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void findByLastName() {
        Owner misha = ownerServiceMap.findByLastName(lastName);
        assertNotNull(misha);
        assertEquals(ownerId,misha.getId());
        assertEquals(lastName,misha.getLastName());
    }

    @Test
    void findByLastNameNotFound() {
        Owner stitch = ownerServiceMap.findByLastName("stitch");
        assertNull(stitch);
    }
}