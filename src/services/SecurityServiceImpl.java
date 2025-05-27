package services;

import data.model.Security;
import data.repository.SecurityRepository;
import data.repository.Securities;
import dtos.requests.SecurityRegisterRequest;
import dtos.responses.SecurityRegisterResponse;

public class SecurityServiceImpl implements SecurityService {
    private SecurityRepository securityRepository = new Securities();
    private SecurityRegisterResponse registerResponse = new SecurityRegisterResponse();

    @Override
    public SecurityRegisterResponse register(SecurityRegisterRequest registerRequest) {
        Security security = new Security();
        security.setFullName(registerRequest.getFullName());
        security.setResident(registerRequest.getResident());
        security.setVisitor(registerRequest.getVisitor());
        securityRepository.save(security);
        registerResponse.setId(security.getId());
        registerResponse.setMessage("Registered successfully");
        return registerResponse;
    }
}