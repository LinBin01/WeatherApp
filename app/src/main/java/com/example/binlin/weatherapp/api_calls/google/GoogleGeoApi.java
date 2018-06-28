package com.example.binlin.weatherapp.api_calls.google;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleGeoApi {

    @GET("json")
    Call<GoogleAddress> getAddress(@Query("address") String address, @Query("api_key") String api_key);

}
