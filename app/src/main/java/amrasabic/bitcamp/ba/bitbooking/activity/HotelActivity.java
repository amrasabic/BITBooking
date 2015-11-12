package amrasabic.bitcamp.ba.bitbooking.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.woxthebox.draglistview.DragItemAdapter;
import com.woxthebox.draglistview.DragListView;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.helpers.Helper;
import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.api.BitBookingApi;
import amrasabic.bitcamp.ba.bitbooking.extras.LoadImage;
import amrasabic.bitcamp.ba.bitbooking.model.Hotel;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * This class handles Hotel list shown as grid layout
 */
public class HotelActivity extends Activity {

    // Declaration of parameters

    private RestAdapter adapter;
    private BitBookingApi api;

    private String mUserToken;
    private HotelsAdapter mHotelsAdapter;
    private DragListView mHotelsList;

    /**
     * On create method
     * handles
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_list);

        SharedPreferences sh = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        mUserToken = sh.getString("User_Token", "");

        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("User_Token", mUserToken);
            }
        };

        adapter = new RestAdapter.Builder()
                .setEndpoint(Helper.IP_ADDRESS)
                .setRequestInterceptor(requestInterceptor)
                .build();

        api = adapter.create(BitBookingApi.class);

        api.getHotels(new Callback<List<Hotel>>() {
            @Override
            public void success(List<Hotel> response, Response response2) {

                mHotelsAdapter = new HotelsAdapter(response, R.layout.hotel_fragment, R.id.item_layout, true);
                // find view component by id
                mHotelsList = (DragListView) findViewById(R.id.hotels_list);
                mHotelsList.setLayoutManager(new GridLayoutManager(getApplication(), 2));
                // set hotel adapter with list of hotels on hotel list view
                mHotelsList.setAdapter(mHotelsAdapter, true);
            }

            @Override
            public void failure(RetrofitError error) {
                // TODO
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
            holder.itemView.setTag(mItemList.get(position).getHotelId());
            if(mItemList.get(position).getHotelImage() != null) {
                new LoadImage(holder.hotelImage).execute(mItemList.get(position).getHotelImage().getImageUrl());
            }
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public class ViewHolder extends DragItemAdapter<Hotel, ViewHolder>.ViewHolder {

            public TextView rating;
            public TextView hotelName;
            public ImageView hotelImage;

            public ViewHolder(final View itemView) {
                super(itemView, mGrabHandleId);
                itemView.setLongClickable(false);
                rating = (TextView) itemView.findViewById(R.id.rating);
                hotelName = (TextView) itemView.findViewById(R.id.hotel_name);
                hotelImage = (ImageView) itemView.findViewById(R.id.hotel_image);
            }

            @Override
            public void onItemClicked(View view) {
                Intent i = new Intent(HotelActivity.this, RoomActivity.class);
                i.putExtra("id", (int) view.getTag());
                startActivity(i);
            }
        }
    }
}
