package amrasabic.bitcamp.ba.bitbooking.model;


public class User {

    private String mFirstName;
    private String mLastName;
    private String mPhoneNumber;
    private String mEmail;
    private String mPassword;
    private String mConfrimPassword;

    public User() {

    }

    public User(String email, String password) {
        mEmail = email;
        mPassword = password;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }
}
