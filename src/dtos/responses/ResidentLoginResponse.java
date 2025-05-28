package dtos.responses;

import dtos.requests.ResidentRegisterRequest;

public class ResidentLoginResponse {
    private String message;
    private String email;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }


}
