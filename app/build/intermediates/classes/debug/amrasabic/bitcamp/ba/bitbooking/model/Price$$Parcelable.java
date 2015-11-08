
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-04T02:15+0100")
public class Price$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Price>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Price price$$4;
    @SuppressWarnings("UnusedDeclaration")
    public final static Price$$Parcelable.Creator$$2 CREATOR = new Price$$Parcelable.Creator$$2();

    public Price$$Parcelable(android.os.Parcel parcel$$12) {
        price$$4 = new amrasabic.bitcamp.ba.bitbooking.model.Price();
        price$$4 .mRoomId = parcel$$12 .readInt();
        price$$4 .mDateFrom = parcel$$12 .readLong();
        price$$4 .mCost = parcel$$12 .readInt();
        price$$4 .mDateTo = parcel$$12 .readLong();
    }

    public Price$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Price price$$5) {
        price$$4 = price$$5;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$13, int flags) {
        parcel$$13 .writeInt(price$$4 .mRoomId);
        parcel$$13 .writeLong(price$$4 .mDateFrom);
        parcel$$13 .writeInt(price$$4 .mCost);
        parcel$$13 .writeLong(price$$4 .mDateTo);
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
        public Price$$Parcelable createFromParcel(android.os.Parcel parcel$$14) {
            return new Price$$Parcelable(parcel$$14);
        }

        @Override
        public Price$$Parcelable[] newArray(int size) {
            return new Price$$Parcelable[size] ;
        }

    }

}
