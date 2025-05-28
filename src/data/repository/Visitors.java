package data.repository;

import data.model.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Visitors implements VisitorRepository {
    private static Visitors visitor = new Visitors();
    private int count = 0;
    private List<Visitor> visitors = new ArrayList<>();

    @Override
    public List<Visitor> getAllVisitors() {
        return new ArrayList<>(visitors);
    }

    @Override
    public Visitor saveVisitor(Visitor visitor) {
        if (isNew(visitor)) saveNew(visitor);else update(visitor);
        return visitor;
    }

    private void update(Visitor visitor) {
        for (int count = 0; count < visitors.size(); count++) {
            if (visitors.get(count).getId() == visitor.getId()) {
                visitors.set(count, visitor);
                return;
            }
        }
    }

    private void saveNew(Visitor visitor) {
        visitor.setId(generateId());
        visitors.add(visitor);
    }

    private int generateId() {
        return ++count;
    }
    private boolean isNew(Visitor visitor) {
        return visitor.getId() == 0;
    }

    @Override
    public void deleteVisitor(int id) {
        for (int count = 0; count < visitors.size(); count++) {
            if (visitors.get(count).getId() == id) {
                visitors.remove(count);
                return;
            }
        }
    }

    @Override
    public long count() {
        return visitors.size();
    }

    @Override
    public Optional<Visitor> findById(int id) {
        for (Visitor visitor : visitors) {
            if (visitor.getId() == id) {
                return Optional.of(visitor);
            }
        }
        return Optional.empty();
    }
}


