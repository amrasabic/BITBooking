package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

@Parcel
public class Hotel {

    @SerializedName("name")
    private String mHotelName;

    @SerializedName("stars")
    private int mRating;

    public Hotel() {
    }

    public Hotel(String hotelName, int rating) {
        mHotelName = hotelName;
        mRating = rating;
    }

    public int getRating() {
        return mRating;
    }

    public String getHotelName() {
        return mHotelName;
    }

}
