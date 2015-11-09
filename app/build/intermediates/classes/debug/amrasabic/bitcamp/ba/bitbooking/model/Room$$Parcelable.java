
package amrasabic.bitcamp.ba.bitbooking.model;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-09T14:49+0100")
public class Room$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Room>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Room room$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Room$$Parcelable.Creator$$4 CREATOR = new Room$$Parcelable.Creator$$4();

    public Room$$Parcelable(android.os.Parcel parcel$$14) {
        room$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Room();
        int int$$3 = parcel$$14 .readInt();
        ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Price> list$$1;
        if (int$$3 < 0) {
            list$$1 = null;
        } else {
            list$$1 = new ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Price>();
            for (int int$$4 = 0; (int$$4 <int$$3); int$$4 ++) {
                amrasabic.bitcamp.ba.bitbooking.model.Price price$$3;
                if (parcel$$14 .readInt() == -1) {
                    price$$3 = null;
                } else {
                    price$$3 = readamrasabic_bitcamp_ba_bitbooking_model_Price(parcel$$14);
                }
                list$$1 .add(price$$3);
            }
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices", list$$1);
        room$$0 .mRoomId = parcel$$14 .readInt();
        int int$$5 = parcel$$14 .readInt();
        java.lang.Integer integer$$1;
        if (int$$5 < 0) {
            integer$$1 = null;
        } else {
            integer$$1 = parcel$$14 .readInt();
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "numberOfBeds", integer$$1);
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "description", parcel$$14 .readString());
        int int$$6 = parcel$$14 .readInt();
        ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image> list$$2;
        if (int$$6 < 0) {
            list$$2 = null;
        } else {
            list$$2 = new ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image>();
            for (int int$$7 = 0; (int$$7 <int$$6); int$$7 ++) {
                amrasabic.bitcamp.ba.bitbooking.model.Image image$$7;
                if (parcel$$14 .readInt() == -1) {
                    image$$7 = null;
                } else {
                    image$$7 = readamrasabic_bitcamp_ba_bitbooking_model_Image(parcel$$14);
                }
                list$$2 .add(image$$7);
            }
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages", list$$2);
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomName", parcel$$14 .readString());
        int int$$8 = parcel$$14 .readInt();
        java.lang.Integer integer$$2;
        if (int$$8 < 0) {
            integer$$2 = null;
        } else {
            integer$$2 = parcel$$14 .readInt();
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomType", integer$$2);
    }

    public Room$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Room room$$1) {
        room$$0 = room$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$15, int flags) {
        if (InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices") == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices").size());
            for (amrasabic.bitcamp.ba.bitbooking.model.Price price$$4 : ((java.util.List<amrasabic.bitcamp.ba.bitbooking.model.Price> ) InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomPrices"))) {
                if (price$$4 == null) {
                    parcel$$15 .writeInt(-1);
                } else {
                    parcel$$15 .writeInt(1);
                    writeamrasabic_bitcamp_ba_bitbooking_model_Price(price$$4, parcel$$15);
                }
            }
        }
        parcel$$15 .writeInt(room$$0 .mRoomId);
        if (InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "numberOfBeds") == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(1);
            parcel$$15 .writeInt(InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "numberOfBeds"));
        }
        parcel$$15 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "description"));
        if (InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages") == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages").size());
            for (amrasabic.bitcamp.ba.bitbooking.model.Image image$$8 : ((java.util.List<amrasabic.bitcamp.ba.bitbooking.model.Image> ) InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "mRoomImages"))) {
                if (image$$8 == null) {
                    parcel$$15 .writeInt(-1);
                } else {
                    parcel$$15 .writeInt(1);
                    writeamrasabic_bitcamp_ba_bitbooking_model_Image(image$$8, parcel$$15);
                }
            }
        }
        parcel$$15 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomName"));
        if (InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomType") == null) {
            parcel$$15 .writeInt(-1);
        } else {
            parcel$$15 .writeInt(1);
            parcel$$15 .writeInt(InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Room.class, room$$0, "roomType"));
        }
    }

    private amrasabic.bitcamp.ba.bitbooking.model.Price readamrasabic_bitcamp_ba_bitbooking_model_Price(android.os.Parcel parcel$$16) {
        amrasabic.bitcamp.ba.bitbooking.model.Price price$$2;
        price$$2 = new amrasabic.bitcamp.ba.bitbooking.model.Price();
        price$$2 .mRoomId = parcel$$16 .readInt();
        price$$2 .mDateFrom = parcel$$16 .readLong();
        price$$2 .mCost = parcel$$16 .readInt();
        price$$2 .mDateTo = parcel$$16 .readLong();
        return price$$2;
    }

    private amrasabic.bitcamp.ba.bitbooking.model.Image readamrasabic_bitcamp_ba_bitbooking_model_Image(android.os.Parcel parcel$$17) {
        amrasabic.bitcamp.ba.bitbooking.model.Image image$$6;
        image$$6 = new amrasabic.bitcamp.ba.bitbooking.model.Image();
        image$$6 .mImageUrl = parcel$$17 .readString();
        image$$6 .mImageId = parcel$$17 .readInt();
        image$$6 .mThumbnail = parcel$$17 .readString();
        return image$$6;
    }

    private void writeamrasabic_bitcamp_ba_bitbooking_model_Price(amrasabic.bitcamp.ba.bitbooking.model.Price price$$5, android.os.Parcel parcel$$18) {
        parcel$$18 .writeInt(price$$5 .mRoomId);
        parcel$$18 .writeLong(price$$5 .mDateFrom);
        parcel$$18 .writeInt(price$$5 .mCost);
        parcel$$18 .writeLong(price$$5 .mDateTo);
    }

    private void writeamrasabic_bitcamp_ba_bitbooking_model_Image(amrasabic.bitcamp.ba.bitbooking.model.Image image$$9, android.os.Parcel parcel$$19) {
        parcel$$19 .writeString(image$$9 .mImageUrl);
        parcel$$19 .writeInt(image$$9 .mImageId);
        parcel$$19 .writeString(image$$9 .mThumbnail);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Room getParcel() {
        return room$$0;
    }

    private final static class Creator$$4
        implements Creator<Room$$Parcelable>
    {


        @Override
        public Room$$Parcelable createFromParcel(android.os.Parcel parcel$$20) {
            return new Room$$Parcelable(parcel$$20);
        }

        @Override
        public Room$$Parcelable[] newArray(int size) {
            return new Room$$Parcelable[size] ;
        }

    }

}
