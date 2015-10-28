package amrasabic.bitcamp.ba.bitbooking.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
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

        Bundle bundle = new Bundle();
        int id = bundle.getInt("id");

        adapter = new RestAdapter.Builder()
                .setEndpoint("http://ip_address:9000")
                .build();

        api = adapter.create(BitBookingApi.class);

        api.getHotelRooms(id, new Callback<List<Room>>() {
            @Override
            public void success(List<Room> response, Response response2) {
                int smthing = 0;
            }

            @Override
            public void failure(RetrofitError error) {
                int smthing = 0;
            }
        });

    }
}
