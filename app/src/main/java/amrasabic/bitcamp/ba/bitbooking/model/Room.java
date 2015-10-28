package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by stvorenje on 10/27/15.
 */
@Parcel
public class Room {

    @SerializedName("name")
    private String roomName;

    @SerializedName("numberOfBeds")
    private Integer numberOfBeds;

    @SerializedName("roomType")
    private Integer roomType;

    @SerializedName("description")
    private String description;

    public Room() {

    }

    public Room(String roomName, Integer numberOfBeds, Integer roomType, String description) {
        this.roomName = roomName;
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.description = description;
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
}
