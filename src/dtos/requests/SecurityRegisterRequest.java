package dtos.requests;

import data.model.Resident;
import data.model.Security;
import data.model.Visitor;

public class SecurityRegisterRequest {
    private String fullName;
    private Resident resident;
    private Visitor visitor;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
}
