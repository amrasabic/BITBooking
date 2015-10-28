package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Hotel {

    public Integer getId() {
        return mId;
    }

    @SerializedName("id")
    private Integer mId;

    @SerializedName("name")
    private String mHotelName;

    @SerializedName("stars")
    private int mRating;

    @SerializedName("location")
    private String mAddress;

    @SerializedName("city")
    private String mCity;

    @SerializedName("country")
    private String mCountry;

    @SerializedName("description")
    private String mDescription;


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
