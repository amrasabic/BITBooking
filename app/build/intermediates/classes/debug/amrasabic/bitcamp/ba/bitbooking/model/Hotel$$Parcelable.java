
package amrasabic.bitcamp.ba.bitbooking.model;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-09T14:49+0100")
public class Hotel$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Hotel>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Hotel hotel$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Hotel$$Parcelable.Creator$$0 CREATOR = new Hotel$$Parcelable.Creator$$0();

    public Hotel$$Parcelable(android.os.Parcel parcel$$0) {
        hotel$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Hotel();
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mAddress", parcel$$0 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelName", parcel$$0 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCity", parcel$$0 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCountry", parcel$$0 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRating", parcel$$0 .readInt());
        int int$$0 = parcel$$0 .readInt();
        ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                amrasabic.bitcamp.ba.bitbooking.model.Image image$$1;
                if (parcel$$0 .readInt() == -1) {
                    image$$1 = null;
                } else {
                    image$$1 = readamrasabic_bitcamp_ba_bitbooking_model_Image(parcel$$0);
                }
                list$$0 .add(image$$1);
            }
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages", list$$0);
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mDescription", parcel$$0 .readString());
        int int$$2 = parcel$$0 .readInt();
        java.lang.Integer integer$$0;
        if (int$$2 < 0) {
            integer$$0 = null;
        } else {
            integer$$0 = parcel$$0 .readInt();
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId", integer$$0);
    }

    public Hotel$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Hotel hotel$$1) {
        hotel$$0 = hotel$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mAddress"));
        parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelName"));
        parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCity"));
        parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCountry"));
        parcel$$1 .writeInt(InjectionUtil.getField(int.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRating"));
        if (InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages") == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages").size());
            for (amrasabic.bitcamp.ba.bitbooking.model.Image image$$2 : ((java.util.List<amrasabic.bitcamp.ba.bitbooking.model.Image> ) InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages"))) {
                if (image$$2 == null) {
                    parcel$$1 .writeInt(-1);
                } else {
                    parcel$$1 .writeInt(1);
                    writeamrasabic_bitcamp_ba_bitbooking_model_Image(image$$2, parcel$$1);
                }
            }
        }
        parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mDescription"));
        if (InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId") == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            parcel$$1 .writeInt(InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId"));
        }
    }

    private amrasabic.bitcamp.ba.bitbooking.model.Image readamrasabic_bitcamp_ba_bitbooking_model_Image(android.os.Parcel parcel$$2) {
        amrasabic.bitcamp.ba.bitbooking.model.Image image$$0;
        image$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Image();
        image$$0 .mImageUrl = parcel$$2 .readString();
        image$$0 .mImageId = parcel$$2 .readInt();
        image$$0 .mThumbnail = parcel$$2 .readString();
        return image$$0;
    }

    private void writeamrasabic_bitcamp_ba_bitbooking_model_Image(amrasabic.bitcamp.ba.bitbooking.model.Image image$$3, android.os.Parcel parcel$$3) {
        parcel$$3 .writeString(image$$3 .mImageUrl);
        parcel$$3 .writeInt(image$$3 .mImageId);
        parcel$$3 .writeString(image$$3 .mThumbnail);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Hotel getParcel() {
        return hotel$$0;
    }

    private final static class Creator$$0
        implements Creator<Hotel$$Parcelable>
    {


        @Override
        public Hotel$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new Hotel$$Parcelable(parcel$$4);
        }

        @Override
        public Hotel$$Parcelable[] newArray(int size) {
            return new Hotel$$Parcelable[size] ;
        }

    }

}
