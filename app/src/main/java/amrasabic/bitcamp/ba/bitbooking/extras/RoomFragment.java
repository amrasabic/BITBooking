package amrasabic.bitcamp.ba.bitbooking.extras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.model.Room;

public class RoomFragment extends Fragment {

    private String mRoomName;
    private String mDescription;
    private int mNumberOfBeds;
    private int mRoomType;
    private Button mButton;

    // newInstance constructor for creating fragment with arguments
    public static RoomFragment newInstance(int page, Room room) {
        RoomFragment fragmentFirst = new RoomFragment();
        Bundle args = new Bundle();
        args.putInt("mNumberOfBeds", room.getNumberOfBeds());
        args.putInt("mRoomType", room.getRoomType());
        args.putString("mRoomName", room.getRoomName());
        args.putString("mDescription", room.getDescription());
        fragmentFirst.setArguments(args);
        return fragmentFirst;

    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRoomName = getArguments().getString("mRoomName");
        mDescription = getArguments().getString("mDescription");
        mNumberOfBeds = getArguments().getInt("mNumberOfBeds", 0);
        mRoomType = getArguments().getInt("mRoomType", 0);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.room_fragment, container, false);

        TextView roomName = (TextView) view.findViewById(R.id.room_name);
        roomName.setText(mRoomName);

        TextView description = (TextView) view.findViewById(R.id.room_desc);
        description.setText(mDescription);

        TextView numberOfBeds = (TextView) view.findViewById(R.id.number_of_beds);
        numberOfBeds.setText(Integer.toString(mNumberOfBeds));

        TextView roomType = (TextView) view.findViewById(R.id.room_type);
        roomType.setText(Integer.toString(mRoomType));

        Button reservation = (Button) view.findViewById(R.id.reservation);
        reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.action.RESERVATION");
                startActivity(i);
            }
        });
        return view;
    }
}
