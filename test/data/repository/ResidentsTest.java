package data.repository;


import data.model.Resident;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        public void testToRegisterResident_findByFullNameTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Blessing");
        Resident savedResident = residents.save(resident1);
        assertEquals(savedResident, residents.findByFullName("Wande Blessing").get());

        Resident resident2 = new Resident();
        resident2.setFullName("Damini Bryan");
        Resident savedResident2 = residents.save(resident2);
        assertEquals(savedResident2, residents.findByFullName("Damini Bryan").get());
    }

        @Test
        public void testToRegisterResident_UpdateResidentWithId_CountIsOneTest () {
        Resident resident1 = new Resident();
        residents.save(resident1);
        assertEquals(1, residents.count());

        Resident resident2 = new Resident();
        resident2.setId(resident1.getId());
        resident2.setFullName("Wande Coker");
        residents.save(resident2);
        assertEquals(1, residents.count());
        assertEquals(1, resident1.getId());

        assertEquals("Wande Coker", residents.findById(resident1.getId()).get().getFullName());
    }

        @Test
        public void testToSaveThreeResidents_UpdateResidentOneWithId_CountIsOneTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Coker");
        residents.save(resident1);
        assertEquals(1, residents.count());

        Resident resident2 = new Resident();
        residents.save(resident2);
        assertEquals(2, residents.count());

        Resident resident3 = new Resident();
        resident3.setId(resident1.getId());
        resident3.setFullName("Wande Ciroma");
        residents.save(resident3);

        assertEquals(2, residents.count());
        assertEquals(1, resident3.getId());
        assertEquals("Wande Ciroma", residents.findById(resident3.getId()).get().getFullName());
        }

        @Test
        public void testToSaveOneResident_DeleteResidentWithId_CountIsZeroTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Coker");
        residents.save(resident1);
        assertEquals(1, residents.count());

        residents.delete(resident1.getId());
        assertEquals(0, residents.count());
        }

        @Test
        public void testToSaveTwoResident_FindAllResident_CountIsTwoTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Coker");
        residents.save(resident1);
        assertEquals(1, residents.count());

        Resident resident2 = new Resident();
        resident2.setFullName("Wande Ciroma");
        residents.save(resident2);
        assertEquals(2, residents.count());

        assertEquals(2, residents.findAll().size());

        }

        @Test
        public void testToSaveTwoResident_FindAllResident_FindResidentByIdTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Coker");
        residents.save(resident1);
        assertEquals(1, residents.count());

        Resident resident2 = new Resident();
        resident2.setFullName("Wande Ciroma");
        residents.save(resident2);
        assertEquals(2, residents.count());

        assertEquals(2, residents.findAll().size());

        assertEquals(resident1, residents.findById(resident1.getId()).get());
    }

    @Test
    public void testToSaveResident_FindResidentById_ReturnTrueTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Coker");
        residents.save(resident1);
        assertTrue(residents.existById(resident1.getId()));
    }

    @Test
    public void testToSaveResident_CheckPassword_ReturnTrueTest () {
        Resident resident1 = new Resident();
        resident1.setFullName("Wande Coker");
        resident1.setPassword("myLove");
        residents.save(resident1);
        assertTrue(residents.checkPassword("myLove", resident1.getId()));
    }
}