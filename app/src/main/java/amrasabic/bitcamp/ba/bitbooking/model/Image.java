package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;


/**
 * This class represents Image model from REST service,
 * with some attributes that are necessary in Android app.
 */
@Parcel
public class Image {

    // Declaration of parameters

    @SerializedName("id")
    public int mImageId;

    @SerializedName("image_url")
    public String mImageUrl;

    @SerializedName("thumbnail")
    public String mThumbnail;

    /**
     * Empty constructor
     */
    public Image() {

    }

    // Declaration of default getters

    public int getImageId() {
        return mImageId;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

}
