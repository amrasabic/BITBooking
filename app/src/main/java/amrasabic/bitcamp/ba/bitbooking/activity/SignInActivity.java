package amrasabic.bitcamp.ba.bitbooking.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.helpers.Helper;
import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Header;
import retrofit.client.Response;

public class SignInActivity extends AppCompatActivity {

    // Declaration of parameters

    private RestAdapter adapter;
    private BitBookingApi api;

    private EditText mEmail, mPassword;
    private Button mSignIn, mSignUp;

    /**
     * On create method
     * handles sign in activity, collects data from fields,
     * send to REST service and on success response opens Hotel activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        adapter = new RestAdapter.Builder()
                .setEndpoint(Helper.IP_ADDRESS)
                .build();

        api = adapter.create(BitBookingApi.class);

        // find view components by id
        mEmail = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);

        mSignIn = (Button) findViewById(R.id.sign_in);
        mSignUp = (Button) findViewById(R.id.go_to_sign_up);

        // set on click mSignIn button listener
        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                api.signIn(String.valueOf(mEmail.getText()), String.valueOf(mPassword.getText()), new Callback<String>() {
                    @Override
                    public void success(String token, Response response2) {

                        SharedPreferences sharedPref = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("User_Token", token);
                        editor.commit();
                        // On success response open Hotel activity
                        Intent main = new Intent("android.intent.action.BOOKING");
                        startActivity(main);
                        finish();
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(SignInActivity.this, "Incorrect email or password! Try again.", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        // set on click mSignUp button listener
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SignIn activity
                Intent main = new Intent("android.intent.action.SIGNUP");
                startActivity(main);
            }

        });
    }
}
