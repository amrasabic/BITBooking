package amrasabic.bitcamp.ba.bitbooking.api;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.model.Hotel;
import amrasabic.bitcamp.ba.bitbooking.model.Price;
import amrasabic.bitcamp.ba.bitbooking.model.Room;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * This interface is used to connect with REST service.
 * Annotations @POST, @GET defines http request type, and forwarded
 * String is route from which data should be requested.
 *
 * Annotation @Query requires form id from which data should be collected.
 * Annotation @Path is used for dynamic routes, which contains, for example ../room/1
 *
 * And Callback response is response from API, when implementing these methods
 * it needs to be defined what to do on success and on failure response from API.
 */
public interface BitBookingApi {


    @POST("/api/user/login")
    public void signIn(@Query("email") String email, @Query("password") String password, Callback<String> callback);

    @POST("/user/register/save")
    public void signUp(@Query("email") String email, @Query("password") String password,
                       @Query("passwordretype")String confirmPassword, @Query("firstname") String firstName,
                       @Query("lastname") String lastName, @Query("phoneNumber") String phoneNumber, Callback<Response> callback);

    @GET("/api/hotels")
    public void getHotels(Callback<List<Hotel>> callback);

    @GET("/api/rooms/{id}")
    public void getHotelRooms(@Path("id") int id, Callback<List<Room>> callback);

    @GET("/api/prices/{id}")
    public void getRoomPrices(@Path("id") int id, Callback<List<Price>> callback);

    @POST("/api/hotel/room/reservation/{id}")
    public void paypal(@Path("id") int roomId, @Query("checkIn") String checkIn, @Query("checkOut") String checkOut,
                       @Query("userId") Integer userId, Callback<Response> callback);

}
