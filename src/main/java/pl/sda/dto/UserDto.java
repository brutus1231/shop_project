package pl.sda.dto;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserDto implements Serializable {

    @Size(min = 6, max = 50, message = "{username.size.invalid}")
    private String username;

    @Size(min = 6, max = 20, message = "{password.size.invalid}")
    private String password;

    private String confirmedPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }
}
