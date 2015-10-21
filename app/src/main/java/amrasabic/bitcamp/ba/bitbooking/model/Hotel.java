package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;

@Parcel
public class Hotel {

    @SerializedName("name")
    private String mHotelName;

    @SerializedName("stars")
    private int mRating;

    public int getRating() {
        return mRating;
    }

    public String getHotelName() {
        return mHotelName;
    }

}
