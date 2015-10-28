package amrasabic.bitcamp.ba.bitbooking.extras;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.model.Room;


public class MyPagerAdapter extends FragmentPagerAdapter {

    private static List<Room> mRooms;


    public MyPagerAdapter(android.support.v4.app.FragmentManager fm, List<Room> rooms) {
        super(fm);
        this.mRooms = rooms;
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return mRooms.size();
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        return RoomFragment.newInstance(0, mRooms.get(position));

    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}

