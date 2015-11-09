
package amrasabic.bitcamp.ba.bitbooking.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-09T14:49+0100")
public class Image$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Image>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Image image$$4;
    @SuppressWarnings("UnusedDeclaration")
    public final static Image$$Parcelable.Creator$$1 CREATOR = new Image$$Parcelable.Creator$$1();

    public Image$$Parcelable(android.os.Parcel parcel$$5) {
        image$$4 = new amrasabic.bitcamp.ba.bitbooking.model.Image();
        image$$4 .mImageUrl = parcel$$5 .readString();
        image$$4 .mImageId = parcel$$5 .readInt();
        image$$4 .mThumbnail = parcel$$5 .readString();
    }

    public Image$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Image image$$5) {
        image$$4 = image$$5;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$6, int flags) {
        parcel$$6 .writeString(image$$4 .mImageUrl);
        parcel$$6 .writeInt(image$$4 .mImageId);
        parcel$$6 .writeString(image$$4 .mThumbnail);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Image getParcel() {
        return image$$4;
    }

    private final static class Creator$$1
        implements Creator<Image$$Parcelable>
    {


        @Override
        public Image$$Parcelable createFromParcel(android.os.Parcel parcel$$7) {
            return new Image$$Parcelable(parcel$$7);
        }

        @Override
        public Image$$Parcelable[] newArray(int size) {
            return new Image$$Parcelable[size] ;
        }

    }

}
