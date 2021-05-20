package example;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
    //input

    String username;
    String password;
    //output
    String message;

    @Override
    public String input() throws Exception {
        System.out.print("Login Form Processing");
        setUsername("Enter User Name here");
        return super.input();
    }

    public String processLogin() {
        setMessage(getText("loginAction.message"));
        System.out.println(getMessage());
        return SUCCESS;

    }

    @Override
    public void validate() {
        if (username == null || username.isEmpty()) {
            this.addFieldError(username, getText("validation.requiredString"));
        }
        if (password == null || password.isEmpty()) {
            this.addFieldError(password, getText("validation.requiredString"));
        }


        if (getUsername().equals(getPassword())) {
            this.addActionError("Login cannot be processed for same values");
            this.addFieldError("password", "It must be different than username Entered");
            this.addActionMessage("Please enter different Password");
        }
    }

    //@StringLengthFieldValidator(minLength = "5", maxLength = "15", key = "validation.stringLength")
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
