package services;

import data.model.AccessCode;
import data.model.Resident;
import data.repository.ResidentRepository;
import dtos.requests.ResidentRegisterRequest;
import dtos.requests.ResidentLoginRequest;
import dtos.requests.ResidentVisitorsRequest;
import dtos.responses.ResidentRegisterResponse;
import dtos.responses.ResidentLoginResponse;

import static utils.Mapper.loginMap;
import static utils.Mapper.map;

public class ResidentServiceImpl implements ResidentService {
    private ResidentRepository residentRepository;


    public ResidentServiceImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public ResidentRegisterResponse register(ResidentRegisterRequest registerRequest) {
        return map(registerRequest);
    }


    @Override
    public ResidentLoginResponse login(ResidentLoginRequest loginRequest) {
        return loginMap(loginRequest);
    }

    @Override
    public AccessCode generateCodeForVisitor(int residentId, ResidentVisitorsRequest visitorRequest) {
        return null;


    }
}