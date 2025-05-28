package data.repository;

import data.model.AccessCode;

public interface AccessCodeRepository{
    AccessCode findByResidentId(int residentId);
    AccessCode findByVisitorId(Long visitorId);
    AccessCode findByResidentAndVisitorId(Long residentId, Long visitorId);
    AccessCode findByVisitor(Long visitorId);
    AccessCode findByResident(Long residentId);
    AccessCode save(AccessCode acc);

}
