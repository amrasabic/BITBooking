
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-03T23:42+0100")
public class Image$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Image>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Image image$$8;
    @SuppressWarnings("UnusedDeclaration")
    public final static Image$$Parcelable.Creator$$3 CREATOR = new Image$$Parcelable.Creator$$3();

    public Image$$Parcelable(android.os.Parcel parcel$$15) {
        image$$8 = new amrasabic.bitcamp.ba.bitbooking.model.Image();
        image$$8 .mImageUrl = parcel$$15 .readString();
        image$$8 .mImageId = parcel$$15 .readInt();
        image$$8 .mThumbnail = parcel$$15 .readString();
    }

    public Image$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Image image$$9) {
        image$$8 = image$$9;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$16, int flags) {
        parcel$$16 .writeString(image$$8 .mImageUrl);
        parcel$$16 .writeInt(image$$8 .mImageId);
        parcel$$16 .writeString(image$$8 .mThumbnail);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Image getParcel() {
        return image$$8;
    }

    private final static class Creator$$3
        implements Creator<Image$$Parcelable>
    {


        @Override
        public Image$$Parcelable createFromParcel(android.os.Parcel parcel$$17) {
            return new Image$$Parcelable(parcel$$17);
        }

        @Override
        public Image$$Parcelable[] newArray(int size) {
            return new Image$$Parcelable[size] ;
        }

    }

}
