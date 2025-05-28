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

    public void setId(int id) {
       this.id = id;
    }
    public int getId() {
        return id;
    }
}
