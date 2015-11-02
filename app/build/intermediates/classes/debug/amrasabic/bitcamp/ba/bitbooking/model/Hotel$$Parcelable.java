
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-02T00:16+0100")
public class Hotel$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Hotel>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Hotel hotel$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Hotel$$Parcelable.Creator$$1 CREATOR = new Hotel$$Parcelable.Creator$$1();

    public Hotel$$Parcelable(android.os.Parcel parcel$$7) {
        hotel$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Hotel();
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mAddress", parcel$$7 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelName", parcel$$7 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCity", parcel$$7 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCountry", parcel$$7 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRating", parcel$$7 .readInt());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mDescription", parcel$$7 .readString());
        int int$$6 = parcel$$7 .readInt();
        java.lang.Integer integer$$2;
        if (int$$6 < 0) {
            integer$$2 = null;
        } else {
            integer$$2 = parcel$$7 .readInt();
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId", integer$$2);
    }

    public Hotel$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Hotel hotel$$1) {
        hotel$$0 = hotel$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$8, int flags) {
        parcel$$8 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mAddress"));
        parcel$$8 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelName"));
        parcel$$8 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCity"));
        parcel$$8 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCountry"));
        parcel$$8 .writeInt(InjectionUtil.getField(int.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRating"));
        parcel$$8 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mDescription"));
        if (InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId") == null) {
            parcel$$8 .writeInt(-1);
        } else {
            parcel$$8 .writeInt(1);
            parcel$$8 .writeInt(InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Hotel getParcel() {
        return hotel$$0;
    }

    private final static class Creator$$1
        implements Creator<Hotel$$Parcelable>
    {


        @Override
        public Hotel$$Parcelable createFromParcel(android.os.Parcel parcel$$9) {
            return new Hotel$$Parcelable(parcel$$9);
        }

        @Override
        public Hotel$$Parcelable[] newArray(int size) {
            return new Hotel$$Parcelable[size] ;
        }

    }

}
