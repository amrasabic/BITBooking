package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

@Parcel
public class Room {

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

    public Room() {

    }

    public Room(String roomName, Integer numberOfBeds, Integer roomType, String description) {
        this.roomName = roomName;
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.description = description;
    }

    public int getRoomId() {
        return mRoomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Price> getRoomPrices() {
        return mRoomPrices;
    }

    public Image getRoomImage() {
        if(mRoomImages.size() > 0) {
            return mRoomImages.get(0);
        }
        return null;
    }

}
