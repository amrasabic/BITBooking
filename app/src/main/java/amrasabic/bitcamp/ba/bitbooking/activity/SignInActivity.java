package amrasabic.bitcamp.ba.bitbooking.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import retrofit.RestAdapter;

public class SignInActivity extends Activity {

    private EditText mEmail, mPassword;
    private Button mSignIn, mSignUp;
    private RestAdapter adapter;
    private BitBookingApi api;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        mEmail = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);

        adapter = new RestAdapter.Builder()
                .setEndpoint("http://192.168.1.10:9000")
                .build();

        api = adapter.create(BitBookingApi.class);

        mSignIn = (Button) findViewById(R.id.sign_in);
        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // this is temporary - can log in without any fields filled
                Intent main = new Intent("android.intent.action.BOOKING");
                startActivity(main);
                finish();

//                api.signIn(String.valueOf(mEmail.getText()), String.valueOf(mPassword.getText()), new Callback<Response>() {
//                    @Override
//                    public void success(Response response, Response response2) {
                // if user successfully logs in opens list of hotels
//                        Intent main = new Intent("android.intent.action.BOOKING");
//                        startActivity(main);
//                        finish();
//                    }
//
//                    @Override
//                    public void failure(RetrofitError error) {
                         /* TODO if log in fails
                         toast "Incorrect email or password! Try again." between button and password */
//                    }
//                });

            }
        });

        mSignUp = (Button) findViewById(R.id.go_to_sign_up);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent main = new Intent("android.intent.action.SIGNUP");
                startActivity(main);
            }

        });
    }
}
