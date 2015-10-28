package amrasabic.bitcamp.ba.bitbooking.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;

import retrofit.RestAdapter;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class SignInActivity extends AppCompatActivity {

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
                .setEndpoint("http://ip_address:9000")
                .build();

        api = adapter.create(BitBookingApi.class);

        mSignIn = (Button) findViewById(R.id.sign_in);
        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                api.signIn(String.valueOf(mEmail.getText()), String.valueOf(mPassword.getText()), new Callback<Response>() {
                    @Override
                    public void success(Response response, Response response2) {
                        // if user successfully logs in opens list of hotels
                        Intent main = new Intent("android.intent.action.BOOKING");
                        startActivity(main);
                        finish();
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        // if user log in fails make Toast
                        Toast.makeText(SignInActivity.this, "Incorrect email or password! Try again.", Toast.LENGTH_SHORT).show();
                    }
                });
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
