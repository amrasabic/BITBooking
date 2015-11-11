
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-11T13:52+0100")
public class Price$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Price>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Price price$$4;
    @SuppressWarnings("UnusedDeclaration")
    public final static Price$$Parcelable.Creator$$3 CREATOR = new Price$$Parcelable.Creator$$3();

    public Price$$Parcelable(android.os.Parcel parcel$$15) {
        price$$4 = new amrasabic.bitcamp.ba.bitbooking.model.Price();
        price$$4 .mRoomId = parcel$$15 .readInt();
        price$$4 .mDateFrom = parcel$$15 .readLong();
        price$$4 .mCost = parcel$$15 .readInt();
        price$$4 .mDateTo = parcel$$15 .readLong();
    }

    public Price$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Price price$$5) {
        price$$4 = price$$5;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$16, int flags) {
        parcel$$16 .writeInt(price$$4 .mRoomId);
        parcel$$16 .writeLong(price$$4 .mDateFrom);
        parcel$$16 .writeInt(price$$4 .mCost);
        parcel$$16 .writeLong(price$$4 .mDateTo);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Price getParcel() {
        return price$$4;
    }

    private final static class Creator$$3
        implements Creator<Price$$Parcelable>
    {


        @Override
        public Price$$Parcelable createFromParcel(android.os.Parcel parcel$$17) {
            return new Price$$Parcelable(parcel$$17);
        }

        @Override
        public Price$$Parcelable[] newArray(int size) {
            return new Price$$Parcelable[size] ;
        }

    }

}
