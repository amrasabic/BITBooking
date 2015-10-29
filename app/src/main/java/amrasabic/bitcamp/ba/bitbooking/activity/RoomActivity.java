package amrasabic.bitcamp.ba.bitbooking.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.Helper;
import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import amrasabic.bitcamp.ba.bitbooking.extras.MyPagerAdapter;
import amrasabic.bitcamp.ba.bitbooking.model.Room;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class RoomActivity extends AppCompatActivity {

    private RestAdapter adapter;
    private BitBookingApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_list);

        int id = getIntent().getExtras().getInt("id");
        adapter = new RestAdapter.Builder()
                .setEndpoint(Helper.IP_ADDRESS)
                .build();

        api = adapter.create(BitBookingApi.class);

        api.getHotelRooms(id, new Callback<List<Room>>() {
            @Override
            public void success(List<Room> mRooms, Response response2) {
                int s = mRooms.size();
                ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
                MyPagerAdapter adapterViewPager = new MyPagerAdapter(getSupportFragmentManager(), mRooms);
                vpPager.setAdapter(adapterViewPager);
            }

            @Override
            public void failure(RetrofitError error) {
                int smthing = 0;
            }
        });

    }
}
