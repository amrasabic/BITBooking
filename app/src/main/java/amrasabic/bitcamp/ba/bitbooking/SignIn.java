package amrasabic.bitcamp.ba.bitbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import retrofit.RestAdapter;

public class SignIn extends Activity {

    private EditText username, password;
    private Button signIn;
    private RestAdapter adapter;
    private BitBookingApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        adapter = new RestAdapter.Builder()
                .setEndpoint("http://192.168.0.100:9000")
                .build();

        api = adapter.create(BitBookingApi.class);

        signIn = (Button) findViewById(R.id.sign_in);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // this is temporary - can log in without any fields filled
                Intent main = new Intent("android.intent.action.BOOKING");
                startActivity(main);
                finish();

//                api.signIn(String.valueOf(username.getText()), String.valueOf(password.getText()), new Callback<Response>() {
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
    }
}
