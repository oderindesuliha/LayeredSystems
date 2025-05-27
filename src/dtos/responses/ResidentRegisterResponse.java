package dtos.responses;

public class ResidentRegisterResponse {
    private int id;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }

    public void setId(int id) {
       this.id = id;
    }
    public int getId() {
        return id;
    }
}
