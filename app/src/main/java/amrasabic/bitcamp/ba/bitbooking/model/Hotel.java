package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

@Parcel
public class Hotel {

    public Integer getHotelId() {
        return mHotelId;
    }

    @SerializedName("id")
    private Integer mHotelId;

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

    @SerializedName("images")
    private List<Image> mRoomImages;

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

    public String getAddress() {
        return mAddress;
    }

    public String getCity() {
        return mCity;
    }

    public String getCountry() {
        return mCountry;
    }

    public String getDescription() {
        return mDescription;
    }

    public Image getHotelImage() {
        if(mRoomImages.size() > 0) {
            return mRoomImages.get(0);
        }
        return null;
    }
}
