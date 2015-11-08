package amrasabic.bitcamp.ba.bitbooking.activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.gson.Gson;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.extras.Helper;
import amrasabic.bitcamp.ba.bitbooking.model.User;

public class ReservationActivity extends AppCompatActivity {

    private static final int DATE_PICKER_TO = 0;
    private static final int DATE_PICKER_FROM = 1;

    private int fromYear, fromMonth,fromDay, toYear, toMonth, toDay;

    private int mRoomId;
    private Button mFromDate;
    private Button mToDate;
    private Button mBookIt;
    private Integer mUserId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation);

        Bundle  extras = getIntent().getExtras();
        mRoomId = extras.getInt("room_id", 0);

        SharedPreferences sh = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
//        Gson gson = new Gson();
//        String json = sh.getString("User", "");
//        User user = gson.fromJson(json, User.class);

        mUserId = sh.getInt("userId", 0);

        mFromDate = (Button) findViewById(R.id.from_date_button);
        mToDate = (Button) findViewById(R.id.to_date_button);
        mBookIt = (Button) findViewById(R.id.book_it);

        mFromDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_PICKER_FROM);
            }
        });

        mToDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_PICKER_TO);
            }
        });

        mBookIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReservationActivity.this, PayPalActivity.class);
                String url = Helper.IP_ADDRESS + "/api/hotel/room/reservation/" + mRoomId + "?" +
                        "checkIn=" + mFromDate.getText() + "&" + "checkOut=" + mToDate.getText() + "&" + "userId=" + mUserId;
                i.putExtra("url", url);
                startActivity(i);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch(id){
            case DATE_PICKER_FROM:
                return new DatePickerDialog(this, from_dateListener, fromYear, fromMonth, fromDay);
            case DATE_PICKER_TO:
                return new DatePickerDialog(this, to_dateListener, toYear, toMonth, toDay);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener from_dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            mFromDate.setText((arg3 + "/" + (arg2 + 1) + "/" + arg1));
        }
    };

    private DatePickerDialog.OnDateSetListener to_dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            mToDate.setText(arg3 + "/" + (arg2 + 1) + "/" + arg1);
        }
    };
}
