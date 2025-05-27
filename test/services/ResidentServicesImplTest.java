package services;

import data.model.Resident;
import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.requests.ResidentLoginRequest;
import dtos.requests.ResidentRegisterRequest;
import dtos.responses.ResidentLoginResponse;
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
        residentService = new ResidentServiceImpl(residentRepository);
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
        residentService.register(residentRegisterRequest);
        assertEquals(1, residentRepository.count());

    }

    @Test
    public void testThatResidentCanLoginAfterRegisterationIsSuccessful(){
        residentRegisterRequest.setFullName("Owonikoko Bolaji");
        residentRegisterRequest.setAddress("Fadeyi");
        residentRegisterRequest.setPhone("09090909090");
        residentRegisterRequest.setEmail("bj@gmail.com");
        residentRegisterRequest.setPassword("1234");
        residentService.register(residentRegisterRequest);
        assertEquals(1, residentRepository.count());

        ResidentLoginRequest residentLoginRequest = new ResidentLoginRequest();
        residentLoginRequest.setEmail("bj@gmail.com");
        residentLoginRequest.setPassword("1234");
        ResidentLoginResponse residentLoginResponse = residentService.login(residentLoginRequest);
        assertEquals("Successfully logged in", residentLoginResponse.getMessage());
    }

    @Test
    public void testThatWhenResidentLogInWithAnIncorrectEmailItReturnsInvalid(){
        residentRegisterRequest.setFullName("Owonikoko Bolaji");
        residentRegisterRequest.setAddress("Fadeyi");
        residentRegisterRequest.setPhone("09090909090");
        residentRegisterRequest.setEmail("bj@gmail.com");
        residentRegisterRequest.setPassword("1234");
        residentService.register(residentRegisterRequest);
        assertEquals(1, residentRepository.count());

        ResidentLoginRequest residentLoginRequest = new ResidentLoginRequest();
        residentLoginRequest.setEmail("bjj@gmail.com");
        residentLoginRequest.setPassword("1234");
        ResidentLoginResponse residentLoginResponse = residentService.login(residentLoginRequest);
        assertEquals("invalid Email", residentLoginResponse.getMessage());


    }
}
