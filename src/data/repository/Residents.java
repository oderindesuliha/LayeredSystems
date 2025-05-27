package data.repository;


import data.model.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Residents implements ResidentRepository{
    public static Residents resident = new Residents();
    private int count = 0;
    private static List <Resident> residents = new ArrayList<>();

    @Override
    public Resident save(Resident resident) {
            if (isNew(resident)) saveNew(resident);else update(resident);
            return resident;
        }

    private void update(Resident resident) {
        for (int count = 0; count < residents.size(); count++) {
            if (residents.get(count).getId() == resident.getId()) {
                residents.set(count, resident);
                return;
            }
        }
    }

    private void saveNew(Resident resident) {
            resident.setId(generateId());
            residents.add(resident);
    }

    private int generateId() {
        return ++count;
    }
    private boolean isNew(Resident resident) {
    return resident.getId() == 0;
    }

    @Override
    public void delete(int id) {
        for (int count = 0; count < residents.size(); count++) {
            if (residents.get(count).getId() == id) {
                residents.remove(count);
                return;
            }
        }
    }

    @Override
    public Optional<Resident> findById(int id) {
        return residents.stream()
                .filter(resident -> resident.getId() == id)
                .findFirst();
        }

    @Override
    public Optional<Resident> findByFullName(String fullName) {
        for (Resident resident : residents) {
            if (resident.getFullName().equals(fullName)) {
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
        return residents;
    }

    @Override
    public boolean existById(int id) {
        return findById(id).isPresent();
    }

    @Override
    public boolean checkPassword(String password, int id) {
        Optional<Resident> resident = findById(id);
        return resident.isPresent() && resident.get().verifyPassword(password);
    }

    @Override
    public Optional<Resident> findByEmail(String email) {
        for (Resident resident : residents) {
            if (resident.getEmail().equals(email)) {
                return Optional.of(resident);
            }
        }
        return Optional.empty();
    }

}
