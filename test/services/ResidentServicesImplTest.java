package services;

import data.model.Resident;
import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.requests.ResidentRegisterRequest;
import dtos.responses.ResidentRegisterResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentServicesImplTest {

    private ResidentService residentService;
    private ResidentRepository residentRepository;
    private ResidentRegisterRequest residentRegisterRequest;

    @BeforeEach
        void setUp() {
        residentService = new ResidentServiceImpl();
        residentRepository = new Residents();
        residentRegisterRequest = new ResidentRegisterRequest();
    }

    @Test
    public void testThatResidentCanRegister_CountIsOne(){
        residentRegisterRequest.setFullName("Owonikoko Bolaji");
        residentRegisterRequest.setAddress("Fadeyi");
        residentRegisterRequest.setPhone("09090909090");
        residentRegisterRequest.setEmail("bj@gmail.com");
        residentRegisterRequest.setPassword("1234");
//        assertEquals(1, residentRepository.count());

        ResidentRegisterResponse response = residentService.register(residentRegisterRequest);
        assertEquals("Registration Successful", response.getMessage());

    }

}