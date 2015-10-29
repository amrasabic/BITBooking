package amrasabic.bitcamp.ba.bitbooking.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.Helper;
import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import amrasabic.bitcamp.ba.bitbooking.model.Price;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ReservationActivity extends AppCompatActivity {

    private Button mFromDate;
    private Button mToDate;

    private RestAdapter adapter;
    private BitBookingApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation);

        mFromDate = (Button) findViewById(R.id.from_date_button);
        mToDate = (Button) findViewById(R.id.to_date_button);

        int id = getIntent().getExtras().getInt("room_id");
        adapter = new RestAdapter.Builder()
                .setEndpoint(Helper.IP_ADDRESS)
                .build();

        api = adapter.create(BitBookingApi.class);

        api.getRoomPrices(id, new Callback<List<Price>>() {
            @Override
            public void success(List<Price> mRoomPrices, Response response2) {
                if(mRoomPrices.size() > 0) {
                    mFromDate.setText(mRoomPrices.get(0).getDateFrom().toString());
                    mToDate.setText(mRoomPrices.get(0).getDateTo().toString());
                }

            }

            @Override
            public void failure(RetrofitError error) {
                int smthing = 0;
            }
        });


    }
}
