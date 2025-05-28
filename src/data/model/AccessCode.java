package data.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class AccessCode {
    private String id;
    private String otp;
    private Resident whomToSee;
    private LocalDateTime timeCreated = LocalDateTime.now();
    private Visitor visitor;

    public AccessCode(String otp) {
        this.otp = generateAccessCode();
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Resident getWhomToSee() {
        return whomToSee;
    }

    public void setWhomToSee(Resident whomToSee) {
        this.whomToSee = whomToSee;
    }

    public String getAccessCode() {
        return id;
    }

    public void setAccessCode(String accessCode) {
        this.id = id;
    }

    public String generateAccessCode() {
        return UUID.randomUUID().toString();

    }


            ;
}
