package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * This class represents Hotel model from REST service,
 * with some attributes that are necessary in Android app.
 */
@Parcel
public class Hotel {

    // Declaration of parameters

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

    /**
     * Empty constructor
     */
    public Hotel() {

    }

    // Declaration of default getters

    public Integer getHotelId() {
        return mHotelId;
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

    /**
     * Method get Hotel image returns first image from Hotel images.
     * If there is at least one image in array of images. Else, returns null.
     * @return - image at index 0, else if array is empty returns null.
     */
    public Image getHotelImage() {
        if(mRoomImages.size() > 0) {
            return mRoomImages.get(0);
        }
        return null;
    }
}
