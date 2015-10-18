package amrasabic.bitcamp.ba.bitbooking.activity;


import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import amrasabic.bitcamp.ba.bitbooking.R;

public class SignUpActivity extends Activity{

    private EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

    }
}
