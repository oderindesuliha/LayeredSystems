package utils;

import data.model.Resident;
import data.repository.ResidentRepository;
import data.repository.Residents;
import data.repository.VisitorRepository;
import data.repository.Visitors;
import dtos.requests.ResidentLoginRequest;
import dtos.requests.ResidentRegisterRequest;
import dtos.responses.ResidentLoginResponse;
import dtos.responses.ResidentRegisterResponse;

public class Mapper {

    private static ResidentRepository residentRepository = new Residents();
    public VisitorRepository visitorRepository = new Visitors();

    public static ResidentRegisterResponse map(ResidentRegisterRequest residentRegisterRequest) {
        Resident resident = new Resident();
        resident.setFullName(residentRegisterRequest.getFullName());
        resident.setEmail(residentRegisterRequest.getEmail());
        resident.setPassword(residentRegisterRequest.getPassword());
        resident.setPhone(residentRegisterRequest.getPhone());
        resident.setAddress(residentRegisterRequest.getAddress());
        residentRepository.save(resident);

        ResidentRegisterResponse response = new ResidentRegisterResponse();
        response.setId(resident.getId());
        return response;
    }

    public static ResidentLoginResponse loginMap(Resident resident) {
        ResidentLoginResponse residentLoginResponse = new ResidentLoginResponse();
        residentLoginResponse.setEmail(resident.getEmail());
        validateEmail(residentLoginResponse.getEmail());

        return residentLoginResponse;
    }

    private static void validateEmail(String email) {
        Resident isValidEmail = residentRepository.findByEmail(email);
        if(isValidEmail == null){
            throw new IllegalArgumentException("invalid Email");
        }
    }

}