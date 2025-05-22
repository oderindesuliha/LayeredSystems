package services;

import data.model.Resident;
import dtos.requests.ResidentRegisterRequest;
import dtos.responses.ResidentRegisterResponse;

import java.util.List;

public interface ResidentService {
    ResidentRegisterResponse register(ResidentRegisterRequest registerResident);
//    void login(RegisterRequest  )
//        generateCode()

}
