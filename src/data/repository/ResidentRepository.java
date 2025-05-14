package data.repository;

import data.model.Resident;

import java.util.List;
import java.util.Optional;

public interface ResidentRepository{
    Resident save(Resident resident);
    void delete(int id);
    Optional<Resident> findById(int id);
    List<Resident> findByFullName(String firstName);
    long count();
    List<Resident> findAll();

}
