package amrasabic.bitcamp.ba.bitbooking.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Image {

    @SerializedName("id")
    public int mImageId;

    @SerializedName("image_url")
    public String mImageUrl;

    @SerializedName("thumbnail")
    public String mThumbnail;

    public Image() {
    }

    public int getImageId() {
        return mImageId;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }
}
