package amrasabic.bitcamp.ba.bitbooking.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import amrasabic.bitcamp.ba.bitbooking.model.User;

import retrofit.RestAdapter;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class SignInActivity extends Activity {

    private EditText mEmail, mPassword;
    private Button mSignIn, mSignUp;
    private RestAdapter adapter;
    private BitBookingApi api;

    private static ArrayList<User> mUsers;

    static {
        mUsers = new ArrayList<>();

        mUsers.add(new User("amra@bitcamp.ba", "amra1234"));
        mUsers.add(new User("ajla@bitcamp.ba", "ajla1234"));
        mUsers.add(new User("edvin@bitcamp.ba", "edvin1234"));
        mUsers.add(new User("boris@bitcamp.ba", "boris1234"));
        mUsers.add(new User("alen@bitcamp.ba", "alen1234"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        mEmail = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);

        adapter = new RestAdapter.Builder()
                .setEndpoint("http://10.202.23.160:9000")
                .build();

        api = adapter.create(BitBookingApi.class);

        mSignIn = (Button) findViewById(R.id.sign_in);
        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // this is temporary - can log in without any fields filled
                for(int i = 0; i < mUsers.size(); i++){
                    if(mUsers.get(i).getEmail().equals(mEmail.getText().toString()) && mUsers.get(i).getPassword().equals(mPassword.getText().toString())) {
                            Intent main = new Intent("android.intent.action.BOOKING");
                            startActivity(main);
                            break;

                    }

                    if (i == mUsers.size() - 1){
                        Toast.makeText(SignInActivity.this, "Incorrect email or password! Try again.", Toast.LENGTH_SHORT).show();
                    }
                }

//               finish();

//                api.signIn(String.valueOf(mEmail.getText()), String.valueOf(mPassword.getText()), new Callback<Response>() {
//                    @Override
//                    public void success(Response response, Response response2) {
//                // if user successfully logs in opens list of hotels
//                        int smthing = 0;
//                        Intent main = new Intent("android.intent.action.BOOKING");
//                        startActivity(main);
////                        finish();
//                    }
//
//                    @Override
//                    public void failure(RetrofitError error) {
//                         // TODO if log in fails
//                        int smthing = 0;
//                         Toast.makeText(SignInActivity.this, "Incorrect email or password! Try again.", Toast.LENGTH_SHORT).show();
//
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
