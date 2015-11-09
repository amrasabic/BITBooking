
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-09T14:49+0100")
public class Reservation$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Reservation>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Reservation reservation$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Reservation$$Parcelable.Creator$$3 CREATOR = new Reservation$$Parcelable.Creator$$3();

    public Reservation$$Parcelable(android.os.Parcel parcel$$11) {
        reservation$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Reservation();
    }

    public Reservation$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Reservation reservation$$1) {
        reservation$$0 = reservation$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$12, int flags) {
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Reservation getParcel() {
        return reservation$$0;
    }

    private final static class Creator$$3
        implements Creator<Reservation$$Parcelable>
    {


        @Override
        public Reservation$$Parcelable createFromParcel(android.os.Parcel parcel$$13) {
            return new Reservation$$Parcelable(parcel$$13);
        }

        @Override
        public Reservation$$Parcelable[] newArray(int size) {
            return new Reservation$$Parcelable[size] ;
        }

    }

}
