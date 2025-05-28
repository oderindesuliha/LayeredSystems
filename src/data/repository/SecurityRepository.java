package data.repository;

import data.model.Security;

import java.util.List;
import java.util.Optional;

public interface SecurityRepository {
    Security save(Security security);
    long count();
    List<Security> findAll();
    void delete(Security security);
    Optional<Security> findById(int Id);
    List<Security> findByFullName(String fullName);


}


