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

import java.util.Calendar;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.helpers.Helper;

/**
 * This activity handles reservation, contains two date pickers,
 * from date and to date which represents starting and ending date of reservation.
 * And button that lead to PayPal activity.
 */
public class ReservationActivity extends AppCompatActivity {

    // Declaration of constants
    private static final int DATE_PICKER_TO = 0;
    private static final int DATE_PICKER_FROM = 1;

    // Declaration of parameters

    private int year, month,day;

    private Integer mRoomId;
    private Integer mUserId;
    private Button mFromDate;
    private Button mToDate;
    private Button mBookIt;

    /**
     * On create method
     * handles date picker and button activity.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation);

        // getting Room id value from intent extra
        mRoomId = getIntent().getExtras().getInt("room_id", 0);

        // getting date instance and setting it to each date picker on start
        Calendar date = Calendar.getInstance();
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);

        // getting user token from "UserInfo" which is stored in shared preferences
        SharedPreferences sh = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        // default value set to zero - 0 if user token is not found
        mUserId = sh.getInt("userId", 0);

        // find each view component by id
        mFromDate = (Button) findViewById(R.id.from_date_button);
        mToDate = (Button) findViewById(R.id.to_date_button);
        mBookIt = (Button) findViewById(R.id.book_it);

        // on button mFromDate click opens up date picker
        mFromDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_PICKER_FROM);
            }
        });
        // on button mToDate click opens up date picker
        mToDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_PICKER_TO);
            }
        });
        // on button mBookIt starts PayPal activity and forwards through Intent string that represents url
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

    /**
     * On date picker create dialog switch through two id cases and return belonging listener
     * @param id - date picker id
     * @return - belonging listener
     */
    @Override
    protected Dialog onCreateDialog(int id) {
        switch(id){
            case DATE_PICKER_FROM:
                return new DatePickerDialog(this, from_dateListener, year, month, day);
            case DATE_PICKER_TO:
                return new DatePickerDialog(this, to_dateListener, year, month, day);
        }
        return null;
    }

    /**
     * Listener for date picker on mFromDate button
     */
    private DatePickerDialog.OnDateSetListener from_dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            mFromDate.setText((arg3 + "/" + (arg2 + 1) + "/" + arg1));
        }
    };

    /**
     * Listener for date picker on mToDate button
     */
    private DatePickerDialog.OnDateSetListener to_dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            mToDate.setText(arg3 + "/" + (arg2 + 1) + "/" + arg1);
        }
    };
}
