package data.repository;

import data.model.AccessCode;

public interface AccessCodeRepository extends ResidentRepository{
    AccessCode findByAccessCode(String accessCode);
    AccessCode findByResidentId(Long residentId);
    AccessCode findByVisitorId(Long visitorId);
    AccessCode findByResidentAndVisitorId(Long residentId, Long visitorId);
    AccessCode findByVisitor(Long visitorId);
    AccessCode findByResident(Long residentId);

}
