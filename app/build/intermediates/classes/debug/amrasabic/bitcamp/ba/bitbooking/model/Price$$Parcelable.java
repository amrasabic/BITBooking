
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-02T00:16+0100")
public class Price$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Price>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Price price$$4;
    @SuppressWarnings("UnusedDeclaration")
    public final static Price$$Parcelable.Creator$$2 CREATOR = new Price$$Parcelable.Creator$$2();

    public Price$$Parcelable(android.os.Parcel parcel$$10) {
        price$$4 = new amrasabic.bitcamp.ba.bitbooking.model.Price();
        price$$4 .mRoomId = parcel$$10 .readInt();
        price$$4 .mDateFrom = parcel$$10 .readLong();
        price$$4 .mCost = parcel$$10 .readInt();
        price$$4 .mDateTo = parcel$$10 .readLong();
    }

    public Price$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Price price$$5) {
        price$$4 = price$$5;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$11, int flags) {
        parcel$$11 .writeInt(price$$4 .mRoomId);
        parcel$$11 .writeLong(price$$4 .mDateFrom);
        parcel$$11 .writeInt(price$$4 .mCost);
        parcel$$11 .writeLong(price$$4 .mDateTo);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Price getParcel() {
        return price$$4;
    }

    private final static class Creator$$2
        implements Creator<Price$$Parcelable>
    {


        @Override
        public Price$$Parcelable createFromParcel(android.os.Parcel parcel$$12) {
            return new Price$$Parcelable(parcel$$12);
        }

        @Override
        public Price$$Parcelable[] newArray(int size) {
            return new Price$$Parcelable[size] ;
        }

    }

}