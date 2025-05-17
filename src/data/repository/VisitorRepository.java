package data.repository;

import data.model.Resident;
import data.model.Visitor;

import java.util.Optional;

public interface VisitorRepository extends ResidentRepository{
    Optional<Resident> findByFullName(String fullName);
    Visitor findByEmail(String email);
    Visitor findByPhone(String phone);
    Visitor findByVisitorId(Long visitorId);
    Visitor findByResidentId(Long residentId);
    Visitor findByAccessCode(String accessCode);

}
