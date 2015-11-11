package amrasabic.bitcamp.ba.bitbooking.extras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import amrasabic.bitcamp.ba.bitbooking.R;
import amrasabic.bitcamp.ba.bitbooking.model.Room;


public class RoomFragment extends Fragment {

    // Declaration of parameters

    private int mRoomId;
    private int mNumberOfBeds;
    private String mRoomName;
    private String mDescription;
    private String mImage;

    /**
     * Constructor newInstance for creating fragment with arguments
     * @param page
     * @param room
     * @return
     */
    //
    public static RoomFragment newInstance(int page, Room room) {
        RoomFragment fragmentFirst = new RoomFragment();
        Bundle args = new Bundle();
        args.putInt("mRoomId", room.getRoomId());
        args.putInt("mNumberOfBeds", room.getNumberOfBeds());
        args.putString("mRoomName", room.getRoomName());
        args.putString("mDescription", room.getDescription());

        if(room.getRoomImage() != null ) {
            args.putString("mImage", room.getRoomImage().getImageUrl());
        }

        fragmentFirst.setArguments(args);
        return fragmentFirst;

    }

    /**
     * Store instance variables based on arguments passed
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRoomName = getArguments().getString("mRoomName");
        mDescription = getArguments().getString("mDescription");
        mNumberOfBeds = getArguments().getInt("mNumberOfBeds", 0);
        mImage = getArguments().getString("mImage");
        mRoomId = getArguments().getInt("mRoomId");
    }

    /**
     * Inflate the view for the fragment based on layout XML
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
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


        Button reservation = (Button) view.findViewById(R.id.reservation);
        reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent("android.intent.action.DATEPICKER");
                i.putExtra("room_id", mRoomId);
                startActivity(i);
            }
        });

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        if (mImage != null) {
            new LoadImage(imageView).execute(mImage);
        }

        return view;
    }
}
