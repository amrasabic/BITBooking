package amrasabic.bitcamp.ba.bitbooking.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.squareup.okhttp.Response;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;

public class SignUpActivity extends Activity{

    private EditText mEmail, mPassword, mConfirmPasword, mFirstName, mLastName, mPhoneNumber;
    private Button mSignUp;

    private RestAdapter adapter;
    private BitBookingApi api;

    private void checkPassword(){

        if(mPassword.getText().equals(mConfirmPasword.getText())){

        } else {

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
                .setEndpoint("http://192.168.1.10:9000")
                .build();

        api = adapter.create(BitBookingApi.class);

        mSignUp = (Button) findViewById(R.id.sign_up);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirects back to sign in
//                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//

                api.signUp(String.valueOf(mEmail.getText()), String.valueOf(mPassword.getText()),
                        String.valueOf(mConfirmPasword.getText()), String.valueOf(mFirstName.getText()),
                        String.valueOf(mLastName.getText()), String.valueOf(mPhoneNumber.getText()),
                        new Callback<retrofit.client.Response>() {

                            @Override
                            public void success(retrofit.client.Response response, retrofit.client.Response response2) {
                                int smthing = 0;
                                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                            }

                            @Override
                            public void failure(RetrofitError error) {
                                int smthing = 0;
                            }
                        });
            }
        });
    }

}
