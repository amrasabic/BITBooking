package amrasabic.bitcamp.ba.bitbooking.model;


import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.Date;

@Parcel
public class Price {

    @SerializedName("id")
    public int mRoomId;
    @SerializedName("dateFrom")
    public Date mDateFrom;
    @SerializedName("dateTo")
    public Date mDateTo;
    @SerializedName("cost")
    public int mCost;

    public Price() {

    }

    public int getId() {
        return mRoomId;
    }

    public Date getDateFrom() {
        return mDateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        mDateFrom = dateFrom;
    }

    public Date getDateTo() {
        return mDateTo;
    }

    public void setDateTo(Date dateTo) {
        mDateTo = dateTo;
    }

    public int getCost() {
        return mCost;
    }

    public void setCost(int cost) {
        mCost = cost;
    }
}
