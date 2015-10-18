package amrasabic.bitcamp.ba.bitbooking.api;

import java.util.List;

import amrasabic.bitcamp.ba.bitbooking.model.Hotel;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

public interface BitBookingApi {

    @POST("/user/login")
    public void signIn(@Query("email") String email, @Query("password") String password, Callback<Response> callback);

    // string - route TODO
    @GET(" string - route TODO ")
    public void getHotels(Callback<List<Hotel>> callback);
}
