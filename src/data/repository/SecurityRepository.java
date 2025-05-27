package data.repository;

import data.model.Security;

import java.util.List;

public interface SecurityRepository {
    Security save(Security security);
    long count();
    List<Security> findAll();

}


