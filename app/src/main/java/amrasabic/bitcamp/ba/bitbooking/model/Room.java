package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;


/**
 * This class represents Room model from REST service,
 * with some attributes that are necessary in Android app.
 */
@Parcel
public class Room {

    // Declaration of parameters

    @SerializedName("id")
    public int mRoomId;

    @SerializedName("name")
    private String roomName;

    @SerializedName("numberOfBeds")
    private Integer numberOfBeds;

    @SerializedName("roomType")
    private Integer roomType;

    @SerializedName("description")
    private String description;

    @SerializedName("prices")
    private List<Price> mRoomPrices;

    @SerializedName("images")
    private List<Image> mRoomImages;

    /**
     * Empty constructor
     */
    public Room() {

    }

    // Declaration of default getters

    public int getRoomId() {
        return mRoomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public String getDescription() {
        return description;
    }

    public List<Price> getRoomPrices() {
        return mRoomPrices;
    }

    /**
     * Method get Room image returns first image from Hotel images.
     * If there is at least one image in array of images. Else, returns null.
     * @return - image at index 0, else if array is empty returns null.
     */
    public Image getRoomImage() {
        if(mRoomImages.size() > 0) {
            return mRoomImages.get(0);
        }
        return null;
    }

}
