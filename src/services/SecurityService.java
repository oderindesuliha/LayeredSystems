package services;

import dtos.requests.SecurityRegisterRequest;
import dtos.responses.SecurityRegisterResponse;

public interface SecurityService {
    SecurityRegisterResponse register(SecurityRegisterRequest registerSecurity);
}
