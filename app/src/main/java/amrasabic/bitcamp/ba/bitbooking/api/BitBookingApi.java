package amrasabic.bitcamp.ba.bitbooking.api;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.model.Hotel;
import amrasabic.bitcamp.ba.bitbooking.model.Price;
import amrasabic.bitcamp.ba.bitbooking.model.Room;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

public interface BitBookingApi {

    @POST("/user/login")
    public void signIn(@Query("email") String email, @Query("password") String password, Callback<Response> callback);

    @POST("/user/register/save")
    public void signUp(@Query("email") String email, @Query("password") String password,
                       @Query("passwordretype")String confirmPassword, @Query("firstname") String firstName,
                       @Query("lastname") String lastName, @Query("phoneNumber") String phoneNumber, Callback<Response> callback);

    @GET("/api/hotels")
    public void getHotels(Callback<List<Hotel>> callback);

    @GET("/api/rooms/{id}")
    public void getHotelRooms(@Path("id") int id, Callback<List<Room>> callback);

    @GET("/api/rooms/{id}")
    public void getRoomPrices(@Path("id") int id, Callback<List<Price>> callback);


}
