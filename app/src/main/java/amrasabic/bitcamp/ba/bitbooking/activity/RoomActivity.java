package amrasabic.bitcamp.ba.bitbooking.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.helpers.Helper;
import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import amrasabic.bitcamp.ba.bitbooking.extras.MyPagerAdapter;
import amrasabic.bitcamp.ba.bitbooking.model.Room;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * This class handles Room activity, contains room information.
 */
public class RoomActivity extends AppCompatActivity {

    // Declaration of parameters

    private RestAdapter adapter;
    private BitBookingApi api;

    private String mUserToken;

    /**
     * On create method
     * handles room list and creates fragment container for each room.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_list);

        SharedPreferences sh = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        mUserToken = sh.getString("User_Token", "");

        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("User_Token", mUserToken);
            }
        };
        // getting Hotel id from intent extra
        int id = getIntent().getExtras().getInt("id");

        adapter = new RestAdapter.Builder()
                .setEndpoint(Helper.IP_ADDRESS)
                .setRequestInterceptor(requestInterceptor)
                .build();

        api = adapter.create(BitBookingApi.class);

        // get hotel room list from REST service
        api.getHotelRooms(id, new Callback<List<Room>>() {
            @Override
            public void success(List<Room> mRooms, Response response2) {
                // find view pager component by id
                ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
                // forward room list to MyPagerAdapter
                MyPagerAdapter adapterViewPager = new MyPagerAdapter(getSupportFragmentManager(), mRooms);
                // and set that adapter to pager component above
                vpPager.setAdapter(adapterViewPager);
            }

            @Override
            public void failure(RetrofitError error) {
                // TODO
            }
        });

    }
}
