package amrasabic.bitcamp.ba.bitbooking.model;

import org.parceler.Parcel;

/**
 * This class represents User model from REST service,
 * with some attributes that are necessary in Android app.
 */
@Parcel
public class User {

    // Declaration of parameters

    private String mFirstName;
    private String mLastName;
    private String mPhoneNumber;
    private String mEmail;
    private String mPassword;
    private String mConfrimPassword;

    /**
     * Empty constructor
     */
    public User() {

    }

    // Declaration of default getters

    public String getEmail() {
        return mEmail;
    }

    public String getPassword() {
        return mPassword;
    }
}
