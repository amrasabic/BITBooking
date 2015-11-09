
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-09T14:49+0100")
public class Price$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Price>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Price price$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Price$$Parcelable.Creator$$2 CREATOR = new Price$$Parcelable.Creator$$2();

    public Price$$Parcelable(android.os.Parcel parcel$$8) {
        price$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Price();
        price$$0 .mRoomId = parcel$$8 .readInt();
        price$$0 .mDateFrom = parcel$$8 .readLong();
        price$$0 .mCost = parcel$$8 .readInt();
        price$$0 .mDateTo = parcel$$8 .readLong();
    }

    public Price$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Price price$$1) {
        price$$0 = price$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$9, int flags) {
        parcel$$9 .writeInt(price$$0 .mRoomId);
        parcel$$9 .writeLong(price$$0 .mDateFrom);
        parcel$$9 .writeInt(price$$0 .mCost);
        parcel$$9 .writeLong(price$$0 .mDateTo);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Price getParcel() {
        return price$$0;
    }

    private final static class Creator$$2
        implements Creator<Price$$Parcelable>
    {


        @Override
        public Price$$Parcelable createFromParcel(android.os.Parcel parcel$$10) {
            return new Price$$Parcelable(parcel$$10);
        }

        @Override
        public Price$$Parcelable[] newArray(int size) {
            return new Price$$Parcelable[size] ;
        }

    }

}
