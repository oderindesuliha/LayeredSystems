package data.repository;

import data.model.Resident;

import java.util.List;
import java.util.Optional;

public interface ResidentRepository{
    Resident save(Resident resident);
    void delete(long id);
    Optional<Resident> findById(long id);
    Optional<Resident> findByFullName(String firstName);
    long count();
    List<Resident> findAll();

}
