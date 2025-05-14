package data.repository;

import data.model.Security;

public interface SecurityRepository extends ResidentRepository{
    Security findByResidentId(Long residentId);
    Security findByVisitorId(Long visitorId);
    Security findByResidentAndVisitorId(Long residentId, Long visitorId);
    Security findBySecurityId(Long securityId);

}
