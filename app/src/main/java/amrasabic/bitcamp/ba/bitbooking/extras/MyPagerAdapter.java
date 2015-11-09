package amrasabic.bitcamp.ba.bitbooking.extras;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.model.Room;


public class MyPagerAdapter extends FragmentPagerAdapter {

    // Declaration of parameters

    private static List<Room> mRooms;

    /**
     * Constructor
     * @param fm
     * @param rooms
     */
    public MyPagerAdapter(FragmentManager fm, List<Room> rooms) {
        super(fm);
        this.mRooms = rooms;
    }

    /**
     * Method get count based on size of array of rooms,
     * returns number on which is based number of pages.
     * @return - total number of pages
     */
    @Override
    public int getCount() {
        return mRooms.size();
    }

    /**
     * Method get item returns the fragment to display for that page
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        return RoomFragment.newInstance(0, mRooms.get(position));

    }

    /**
     * Method get page title receive int as position and
     * returns the page title for the top indicator
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}

