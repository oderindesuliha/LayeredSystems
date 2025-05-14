package data.repository;


import data.model.Resident;

import java.util.List;
import java.util.Optional;

public class Residents implements ResidentRepository{

    @Override
    public Resident save(Resident resident) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Resident> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Resident> findByFullName(String firstName) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public List<Resident> findAll() {
        return List.of();
    }
}
