
package amrasabic.bitcamp.ba.bitbooking.model;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-11T13:52+0100")
public class Room$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Room>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Room room$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Room$$Parcelable.Creator$$1 CREATOR = new Room$$Parcelable.Creator$$1();

    public Room$$Parcelable(android.os.Parcel parcel$$3) {
        room$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Room();
        int int$$0 = parcel$$3 .readInt();
        ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Price> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Price>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                amrasabic.bitcamp.ba.bitbooking.model.Price price$$1;
                if (parcel$$3 .readInt() == -1) {
                    price$$1 = null;
                } else {
                    price$$1 = readamrasabic_bitcamp_ba_bitbooking_model_Price(parcel$$3);
                }
                list$$0 .add(price$$1);
            }
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices", list$$0);
        room$$0 .mRoomId = parcel$$3 .readInt();
        int int$$2 = parcel$$3 .readInt();
        java.lang.Integer integer$$0;
        if (int$$2 < 0) {
            integer$$0 = null;
        } else {
            integer$$0 = parcel$$3 .readInt();
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "numberOfBeds", integer$$0);
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "description", parcel$$3 .readString());
        int int$$3 = parcel$$3 .readInt();
        ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image> list$$1;
        if (int$$3 < 0) {
            list$$1 = null;
        } else {
            list$$1 = new ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image>();
            for (int int$$4 = 0; (int$$4 <int$$3); int$$4 ++) {
                amrasabic.bitcamp.ba.bitbooking.model.Image image$$1;
                if (parcel$$3 .readInt() == -1) {
                    image$$1 = null;
                } else {
                    image$$1 = readamrasabic_bitcamp_ba_bitbooking_model_Image(parcel$$3);
                }
                list$$1 .add(image$$1);
            }
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages", list$$1);
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomName", parcel$$3 .readString());
        int int$$5 = parcel$$3 .readInt();
        java.lang.Integer integer$$1;
        if (int$$5 < 0) {
            integer$$1 = null;
        } else {
            integer$$1 = parcel$$3 .readInt();
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomType", integer$$1);
    }

    public Room$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Room room$$1) {
        room$$0 = room$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$4, int flags) {
        if (InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices") == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices").size());
            for (amrasabic.bitcamp.ba.bitbooking.model.Price price$$2 : ((java.util.List<amrasabic.bitcamp.ba.bitbooking.model.Price> ) InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices"))) {
                if (price$$2 == null) {
                    parcel$$4 .writeInt(-1);
                } else {
                    parcel$$4 .writeInt(1);
                    writeamrasabic_bitcamp_ba_bitbooking_model_Price(price$$2, parcel$$4);
                }
            }
        }
        parcel$$4 .writeInt(room$$0 .mRoomId);
        if (InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "numberOfBeds") == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(1);
            parcel$$4 .writeInt(InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "numberOfBeds"));
        }
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "description"));
        if (InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages") == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages").size());
            for (amrasabic.bitcamp.ba.bitbooking.model.Image image$$2 : ((java.util.List<amrasabic.bitcamp.ba.bitbooking.model.Image> ) InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages"))) {
                if (image$$2 == null) {
                    parcel$$4 .writeInt(-1);
                } else {
                    parcel$$4 .writeInt(1);
                    writeamrasabic_bitcamp_ba_bitbooking_model_Image(image$$2, parcel$$4);
                }
            }
        }
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomName"));
        if (InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomType") == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(1);
            parcel$$4 .writeInt(InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomType"));
        }
    }

    private amrasabic.bitcamp.ba.bitbooking.model.Price readamrasabic_bitcamp_ba_bitbooking_model_Price(android.os.Parcel parcel$$5) {
        amrasabic.bitcamp.ba.bitbooking.model.Price price$$0;
        price$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Price();
        price$$0 .mRoomId = parcel$$5 .readInt();
        price$$0 .mDateFrom = parcel$$5 .readLong();
        price$$0 .mCost = parcel$$5 .readInt();
        price$$0 .mDateTo = parcel$$5 .readLong();
        return price$$0;
    }

    private amrasabic.bitcamp.ba.bitbooking.model.Image readamrasabic_bitcamp_ba_bitbooking_model_Image(android.os.Parcel parcel$$6) {
        amrasabic.bitcamp.ba.bitbooking.model.Image image$$0;
        image$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Image();
        image$$0 .mImageUrl = parcel$$6 .readString();
        image$$0 .mImageId = parcel$$6 .readInt();
        image$$0 .mThumbnail = parcel$$6 .readString();
        return image$$0;
    }

    private void writeamrasabic_bitcamp_ba_bitbooking_model_Price(amrasabic.bitcamp.ba.bitbooking.model.Price price$$3, android.os.Parcel parcel$$7) {
        parcel$$7 .writeInt(price$$3 .mRoomId);
        parcel$$7 .writeLong(price$$3 .mDateFrom);
        parcel$$7 .writeInt(price$$3 .mCost);
        parcel$$7 .writeLong(price$$3 .mDateTo);
    }

    private void writeamrasabic_bitcamp_ba_bitbooking_model_Image(amrasabic.bitcamp.ba.bitbooking.model.Image image$$3, android.os.Parcel parcel$$8) {
        parcel$$8 .writeString(image$$3 .mImageUrl);
        parcel$$8 .writeInt(image$$3 .mImageId);
        parcel$$8 .writeString(image$$3 .mThumbnail);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Room getParcel() {
        return room$$0;
    }

    private final static class Creator$$1
        implements Creator<Room$$Parcelable>
    {


        @Override
        public Room$$Parcelable createFromParcel(android.os.Parcel parcel$$9) {
            return new Room$$Parcelable(parcel$$9);
        }

        @Override
        public Room$$Parcelable[] newArray(int size) {
            return new Room$$Parcelable[size] ;
        }

    }

}
