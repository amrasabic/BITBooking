package amrasabic.bitcamp.ba.bitbooking.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 */
public class SignUpActivity extends Activity{

    private EditText mEmail, mPassword, mConfirmPasword, mFirstName, mLastName, mPhoneNumber;
    private Button mSignUp;

    private RestAdapter adapter;
    private BitBookingApi api;

    /**
     * Check password match method
     * <p>
     * Compares with equals method password field and confirm password field.
     * @return - boolean  value true if they are equal, else returns false
     */
    private boolean checkPasswordMatch(){
        if(mPassword.getText().toString().equals(mConfirmPasword.getText().toString())){
            return true;
        } else {
            Toast.makeText(SignUpActivity.this, "Passwords doesn't match.", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    /**
     * Validate email method
     * <p>
     * This method is based on EmailValidator, and validate email address form email field.
     * To use EmailValidator add this dependency: <b>compile 'commons-validator:commons-validator:1.4.0'</b>
     *
     * @return - boolean value true if email is valid, else returns false
     */
    private boolean validateEmail(){
        EmailValidator validator = EmailValidator.getInstance();

        if(validator.isValid(mEmail.getText().toString())) {
            return true;
        } else {
            Toast.makeText(SignUpActivity.this, "Email is not valid.", Toast.LENGTH_SHORT).show();
            return false;
        }

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
                .setEndpoint(String.valueOf("http://10.202.23.160:9000"))
                .build();

        api = adapter.create(BitBookingApi.class);

        mSignUp = (Button) findViewById(R.id.sign_up);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirects back to sign in
                boolean email = validateEmail();
                boolean pass = checkPasswordMatch();

                if(pass) {
                    Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

        //        Toast.makeText(SignUpActivity.this, "Validation is wrong.", Toast.LENGTH_SHORT).show();



//                api.signUp(String.valueOf(mEmail.getText()), String.valueOf(mPassword.getText()),
//                        String.valueOf(mConfirmPasword.getText()), String.valueOf(mFirstName.getText()),
//                        String.valueOf(mLastName.getText()), String.valueOf(mPhoneNumber.getText()),
//                        new Callback<retrofit.client.Response>() {
//
//                            @Override
//                            public void success(retrofit.client.Response response, retrofit.client.Response response2) {
//                                int smthing = 0;
//                                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
//                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                                startActivity(intent);
//                            }
//
//                            @Override
//                            public void failure(RetrofitError error) {
//                                int smthing = 0;
//                            }
//                        });
            }
        });
    }

}
