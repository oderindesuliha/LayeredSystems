package services;

import data.model.Resident;
import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.requests.ResidentRegisterRequest;
import dtos.responses.ResidentRegisterResponse;

public class ResidentServiceImpl implements ResidentService {
             private ResidentRepository residentRepository = new Residents();
             private ResidentRegisterResponse registerResponse= new ResidentRegisterResponse();
    @Override
    public ResidentRegisterResponse register(ResidentRegisterRequest registerRequest) {
        Resident resident = new Resident();
        resident.setFullName(registerRequest.getFullName());
        resident.setEmail(registerRequest.getEmail());
        resident.setPassword(registerRequest.getPassword());
        resident.setPhone(registerRequest.getPhone());
        resident.setAddress(registerRequest.getAddress());
        residentRepository.save(resident);

        registerResponse.setMessage("Successfully registered");

        return registerResponse;
    }
}

