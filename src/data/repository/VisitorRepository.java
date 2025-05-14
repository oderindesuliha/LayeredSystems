package data.repository;

import data.model.Resident;
import data.model.Visitor;

import java.util.List;

public interface VisitorRepository extends ResidentRepository{
    List<Resident> findByFullName(String fullName);
    Visitor findByEmail(String email);
    Visitor findByPhone(String phone);
    Visitor findByVisitorId(Long visitorId);
    Visitor findByResidentId(Long residentId);
    Visitor findByAccessCode(String accessCode);

}
