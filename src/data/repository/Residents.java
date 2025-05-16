package data.repository;


import data.model.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Residents implements ResidentRepository{

    private List<Resident> residents = new ArrayList<>();

    @Override
    public Resident save(Resident resident) {
        residents.add(resident);
        return resident;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Optional<Resident> findById(long id) {
        for (Resident resident : residents) {
            if (resident.getId() == id) {
                return Optional.of(resident);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Resident> findByFullName(String firstName) {
        for (Resident resident : residents) {
            if (resident.getFullName().equals(firstName)) {
                return Optional.of(resident);
            }
        }
        return Optional.empty();
    }

    @Override
    public long count() {
        return residents.size();
    }

    @Override
    public List<Resident> findAll() {
        return List.of();
    }
}
