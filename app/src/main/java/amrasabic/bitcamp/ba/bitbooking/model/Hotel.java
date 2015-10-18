package amrasabic.bitcamp.ba.bitbooking.model;

//import com.google.gson.annotations.SerializedName;
//import org.parceler.Parcel;


//@Parcel
public class Hotel {

  //  @SerializedName("hotel")
    private String hotelName;

  //  @SerializedName("rating")
    private int rating;

    public Hotel (String h, int r) {
        this.hotelName = h;
        this.rating = r;
    }

    public int getRating() {
        return rating;
    }

    public String getHotelName() {
        return hotelName;
    }

}
