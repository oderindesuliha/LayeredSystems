package services;

import data.model.AccessCode;
import data.model.Resident;
import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.requests.ResidentRegisterRequest;
import dtos.requests.ResidentLoginRequest;
import dtos.requests.ResidentVisitorsRequest;
import dtos.responses.ResidentRegisterResponse;
import dtos.responses.ResidentLoginResponse;

import static utils.Mapper.loginMap;
import static utils.Mapper.map;

public class ResidentServiceImpl implements ResidentService {
    private ResidentRepository residentRepository = new Residents();

public ResidentServiceImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public ResidentRegisterResponse register(ResidentRegisterRequest registerRequest) {
        return map(registerRequest);
    }


    @Override
    public ResidentLoginResponse login(ResidentLoginRequest loginRequest) {
        Resident resident = residentRepository.findByEmail(loginRequest.getEmail());
        if(resident == null || !resident.getPassword().equals(loginRequest.getPassword())){
            throw new IllegalArgumentException("invalid Email or Password");
        }
        return loginMap(resident);
    }

    @Override
    public AccessCode generateCodeForVisitor(int residentId, ResidentVisitorsRequest visitorRequest) {
        return null;


    }
}