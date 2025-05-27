package services;

import data.model.AccessCode;
import dtos.requests.ResidentVisitorsRequest;
import dtos.requests.ResidentLoginRequest;
import dtos.requests.ResidentRegisterRequest;
import dtos.responses.ResidentLoginResponse;
import dtos.responses.ResidentRegisterResponse;


public interface ResidentService {
    ResidentRegisterResponse register(ResidentRegisterRequest registerResident);

    ResidentLoginResponse login(ResidentLoginRequest loginResident);

    AccessCode generateCodeForVisitor(int residentId, ResidentVisitorsRequest visitorRequest);
}
