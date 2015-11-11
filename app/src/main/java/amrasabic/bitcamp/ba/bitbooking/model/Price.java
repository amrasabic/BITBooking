package amrasabic.bitcamp.ba.bitbooking.model;


import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * This class represents Price model from REST service,
 * with some attributes that are necessary in Android app.
 */
@Parcel
public class Price {

    // Declaration of parameters

    @SerializedName("id")
    public int mRoomId;
    @SerializedName("dateFrom")
    public long mDateFrom;
    @SerializedName("dateTo")
    public long mDateTo;
    @SerializedName("cost")
    public int mCost;

    /**
     * Empty constructor
     */
    public Price() {

    }

    // Declaration of default getters

    public int getId() {
        return mRoomId;
    }

    public long getDateFrom() {
        return mDateFrom;
    }

    public long getDateTo() {
        return mDateTo;
    }

    public int getCost() {
        return mCost;
    }

}
