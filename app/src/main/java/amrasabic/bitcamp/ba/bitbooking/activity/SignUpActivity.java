package amrasabic.bitcamp.ba.bitbooking.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import amrasabic.bitcamp.ba.bitbooking.extras.Helper;
import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;

import org.apache.commons.validator.routines.EmailValidator;

public class SignUpActivity extends AppCompatActivity {

    private EditText mEmail, mPassword, mConfirmPasword, mFirstName, mLastName, mPhoneNumber;
    private Button mSignUp;

    private RestAdapter adapter;
    private BitBookingApi api;

    /**
     * Compares with equals method password field and confirm password field.
     * Sends Toast if passwords doesn't match.
     */
    private boolean checkPasswordMatch(String password, String confirmPassword) {
        if (password.equals("") || confirmPassword.equals("")) {
            Toast.makeText(SignUpActivity.this, "Enter matching passwords.", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (password.length() < 8) {
            Toast.makeText(SignUpActivity.this, "Password should be al least 8 characters long and include special characters.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!password.equals(confirmPassword)) {
            Toast.makeText(SignUpActivity.this, "Passwords doesn't match.", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    /**
     * This method is based on EmailValidator, and validate email address form email field.
     * To use EmailValidator add this dependency: <b>compile 'commons-validator:commons-validator:1.4.0'</b>
     *
     * @return - boolean value true if email is valid, else returns false
     */
    private boolean validateEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        if (email.equals("")) {
            Toast.makeText(SignUpActivity.this, "Email is required.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!validator.isValid(email)) {
            Toast.makeText(SignUpActivity.this, "Email is not valid.", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    /**
     * Validates does the param String word contains only letters and is it longer then 2 letters.
     *
     * @param word - validates this string
     * @return - boolean value true if word is valid and longer then 2 letters, else returns false and returns false for empty String
     */
    private boolean validateForOnyLetters(String word) {
        if (word.equals("")) {
            Toast.makeText(SignUpActivity.this, "Name field is required.", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!word.matches("[a-zA-Z]+") && word.length() > 2) {
            Toast.makeText(SignUpActivity.this, "Name field can only contain letters.", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    /**
     * Validates does the param String number contains only digits and is number length in range 12-15.
     *
     * @return boolean value true if number is valid and number length in range 12-15, else returns false and returns false for empty String
     */
    private boolean validateForOnlyDigits(String number) {
        if (number.equals("")) {
            Toast.makeText(SignUpActivity.this, "Phone number is required.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!number.matches("[0-9]+") || (number.length() < 15 && number.length() < 12)) {
            Toast.makeText(SignUpActivity.this, "Phone number is not valid.", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        mEmail = (EditText) findViewById(R.id.email);
        mPassword = (EditText) findViewById(R.id.enter_password);
        mConfirmPasword = (EditText) findViewById(R.id.confirm_password);
        mFirstName = (EditText) findViewById(R.id.first_name);
        mLastName = (EditText) findViewById(R.id.last_name);
        mPhoneNumber = (EditText) findViewById(R.id.phone_number);

        adapter = new RestAdapter.Builder()
                .setEndpoint(String.valueOf(Helper.IP_ADDRESS))
                .build();

        api = adapter.create(BitBookingApi.class);

        mSignUp = (Button) findViewById(R.id.sign_up);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mEmail.getText().toString();
                String password = mPassword.getText().toString();
                String confirmPassword = mConfirmPasword.getText().toString();
                String firstName = mFirstName.getText().toString();
                String lastName = mLastName.getText().toString();
                String number = mPhoneNumber.getText().toString();

                if (validateEmail(email)) {
                    if (checkPasswordMatch(password, confirmPassword)) {
                        if (validateForOnyLetters(firstName)) {
                            if (validateForOnyLetters(lastName)) {
                                if (validateForOnlyDigits(number)) {
                                    // redirects back to sign in
                                    api.signUp(String.valueOf(mEmail.getText()), String.valueOf(mPassword.getText()),
                                            String.valueOf(mConfirmPasword.getText()), String.valueOf(mFirstName.getText()),
                                            String.valueOf(mLastName.getText()), String.valueOf(mPhoneNumber.getText()),
                                            new Callback<retrofit.client.Response>() {

                                                @Override
                                                public void success(retrofit.client.Response response, retrofit.client.Response response2) {
                                                    Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                                                    Toast.makeText(SignUpActivity.this, R.string.sign_up_toast, Toast.LENGTH_LONG).show();
                                                    startActivity(intent);
                                                }

                                                @Override
                                                public void failure(RetrofitError error) {
                                                    // TODO: 10/22/15
                                                }
                                            });
                                }
                            }
                        }
                    }
                }

            }
        });
    }
}
