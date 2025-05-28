package data.repository;

import data.model.Resident;
import data.model.Visitor;

import java.util.List;
import java.util.Optional;

public interface VisitorRepository{
    List<Visitor> getAllVisitors();
    Visitor saveVisitor(Visitor visitor);
    void deleteVisitor(int id);
    long count();
    Optional<Visitor> findById(int id);


}
