package data.repository;

import data.model.Security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Securities implements SecurityRepository{
    private int count = 0;
    private List<Security> securities = new ArrayList<>();

    @Override
    public void delete(Security security) {
        for (int count = 0; count < securities.size(); count++) {
            if (securities.get(count).getId() == security.getId()) {
                securities.remove(count);
                return;
            }
        }

    }

    @Override
    public Optional<Security> findById(int Id) {
        for (Security security : securities) {
            if (security.getId() == Id) {
                return Optional.of(security);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Security> findByFullName(String fullName) {
        return List.of();
    }

    @Override
    public Security save(Security security) {
        if (isNew(security)) saveNew(security);else update(security);
        return security;
    }

    private void update(Security security) {
        for (int count = 0; count < securities.size(); count++) {
            if (securities.get(count).getId() == security.getId()) {
                securities.set(count, security);
                return;
            }
        }
    }

    private void saveNew(Security security) {
        security.setId(generateId());
        securities.add(security);
    }

    private int generateId() {
        return ++count;
    }
    private boolean isNew(Security security) {
        return security.getId() == 0;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public List<Security> findAll() {
        return List.of();
    }
}
