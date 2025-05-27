package data.repository;

import data.model.Resident;

import java.util.List;
import java.util.Optional;

public interface ResidentRepository{
    Resident save(Resident resident);
    void delete(int id);
    Optional<Resident> findById(int id);
    Optional<Resident> findByFullName(String fullName);
    long count();
    List<Resident> findAll();
    boolean existById(int id);
    boolean checkPassword(String password, int id);
    Optional<Resident> findByEmail(String email);

}
