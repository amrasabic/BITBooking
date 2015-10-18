package amrasabic.bitcamp.ba.bitbooking.model;

//import com.google.gson.annotations.SerializedName;
//import org.parceler.Parcel;


//@Parcel
public class Hotel {

  //  @SerializedName("hotel")
    private String mHotelName;

  //  @SerializedName("mRating")
    private int mRating;

    public Hotel (String h, int r) {
        this.mHotelName = h;
        this.mRating = r;
    }

    public int getRating() {
        return mRating;
    }

    public String getHotelName() {
        return mHotelName;
    }

}
