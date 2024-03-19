package Objects;

import java.util.HashMap;

public class LogInObject {
    private String SignInTitle;
    private String Email;
    private String Password;
    private String Message;

    public LogInObject (HashMap<String,String> TestData){
        PrepareData(TestData);

    }

    public void PrepareData (HashMap<String,String> TestData){


        for (String Key: TestData.keySet()){
            switch (Key) {
                case "SignInTitle":
                    setSignInTitle(TestData.get(Key));
                    break;
                case "Email":
                    setEmail(TestData.get(Key));
                    break;
                case "Password":
                    setPassword(TestData.get(Key));
                    break;
                case "Message" :
                    setMessage(TestData.get(Key));
                    break;
            }
        }
    }

    public String getSignInTitle() {
        return SignInTitle;
    }

    public void setSignInTitle(String signInTitle) {
        SignInTitle = signInTitle;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
