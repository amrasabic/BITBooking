package amrasabic.bitcamp.ba.bitbooking.model;


import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.Date;

@Parcel
public class Price {

    @SerializedName("id")
    public int mRoomId;
    @SerializedName("dateFrom")
    public long mDateFrom;
    @SerializedName("dateTo")
    public long mDateTo;
    @SerializedName("cost")
    public int mCost;

    public Price() {

    }

    public int getId() {
        return mRoomId;
    }

    public long getDateFrom() {
        return mDateFrom;
    }

    public void setDateFrom(long dateFrom) {
        mDateFrom = dateFrom;
    }

    public long getDateTo() {
        return mDateTo;
    }

    public void setDateTo(long dateTo) {
        mDateTo = dateTo;
    }

    public int getCost() {
        return mCost;
    }

    public void setCost(int cost) {
        mCost = cost;
    }
}
