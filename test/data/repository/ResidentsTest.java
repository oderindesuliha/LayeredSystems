package data.repository;


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
            Residents residents = new Residents();
            assertEquals(residents.count(), 0);
        }

        @Test

    }