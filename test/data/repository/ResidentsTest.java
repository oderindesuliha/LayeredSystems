package data.repository;


import data.model.Resident;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResidentsTest {
    private Residents residents;
    @BeforeEach
    void setUp() {
        residents = new Residents();
    }

        @Test
        public void testThatCountIsZero_BeforeCreation () {

            assertEquals(0, residents.count());
        }

        @Test
        public void testToRegisterResident_CountIsOneTest () {
        Resident resident1 = new Resident();
        residents.save(resident1);
        assertEquals(1, residents.count());

        }

        @Test
        public void testToRegisterResident_findIdByTest () {
        Resident resident1 = new Resident();
        Resident savedResident = residents.save(resident1);
        assertEquals(savedResident, residents.findById(resident1.getId()).get());
    }

        @Test
        public void testToRegisterResident_findByUserNameTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Blessing");
        Resident savedResident = residents.save(resident1);
        Resident foundResident = residents.findByFullName(resident1.getFullName()).get();
        assertEquals(savedResident, foundResident);

        Resident resident2 = new Resident();
        resident2.setFullName("Damini Bryan");
        Resident savedResident2 = residents.save(resident2);
        assertEquals("Damini Bryan", residents.findByFullName(savedResident2.getFullName()).get().getFullName());
    }
}