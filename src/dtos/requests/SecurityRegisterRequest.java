package dtos.requests;

public class SecurityRegisterRequest {
    private String id;
    private String fullName;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}