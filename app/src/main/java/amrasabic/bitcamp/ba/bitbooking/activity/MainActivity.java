package amrasabic.bitcamp.ba.bitbooking.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.woxthebox.draglistview.DragItemAdapter;
import com.woxthebox.draglistview.DragListView;

import java.util.ArrayList;
import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.model.Hotel;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    private RestAdapter adapter;
    private BitBookingApi api;
    private HotelsAdapter mHotelsAdapter;
    private DragListView mHotelsList;

    private List<Hotel> hotels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new RestAdapter.Builder()
                .setEndpoint("http://ip_address:9000")
                .build();

        api = adapter.create(BitBookingApi.class);

        api.getHotels(new Callback<List<Hotel>>() {
            @Override
            public void success(List<Hotel> response, Response response2) {

                mHotelsAdapter = new HotelsAdapter(response, R.layout.hotel_item, R.id.item_layout, true);
                mHotelsList = (DragListView) findViewById(R.id.hotels_list);
                mHotelsList.setLayoutManager(new GridLayoutManager(getApplication(), 2));
                mHotelsList.setAdapter(mHotelsAdapter, true);
            }

            @Override
            public void failure(RetrofitError error) {
                // TODO: 10/21/15
            }
        });

    }

    public class HotelsAdapter extends DragItemAdapter<Hotel, HotelsAdapter.ViewHolder> {

        private int mLayoutId;
        private int mGrabHandleId;

        public HotelsAdapter(List<Hotel> list, int layoutId, int grabHandleId, boolean dragOnLongPress) {
            super(dragOnLongPress);
            mLayoutId = layoutId;
            mGrabHandleId = grabHandleId;
            setHasStableIds(true);
            setItemList(list);

        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(mLayoutId, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            super.onBindViewHolder(holder, position);
            holder.hotelName.setText(mItemList.get(position).getHotelName());
            holder.rating.setText(Integer.toString(mItemList.get(position).getRating()));
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public class ViewHolder extends DragItemAdapter<Hotel, HotelsAdapter.ViewHolder>.ViewHolder {

            public TextView rating;
            public TextView hotelName;

            public ViewHolder(final View itemView) {
                super(itemView, mGrabHandleId);
                itemView.setLongClickable(false);
                rating = (TextView) itemView.findViewById(R.id.rating);
                hotelName = (TextView) itemView.findViewById(R.id.hotel_name);
            }

            @Override
            public void onItemClicked(View view) {
                // TODO: 10/21/15
            }
        }
    }
}
