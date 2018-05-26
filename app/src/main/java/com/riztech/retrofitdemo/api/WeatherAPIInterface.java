package com.riztech.retrofitdemo.api;

import com.riztech.retrofitdemo.models.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherAPIInterface {

    // 44f24b98cf927839b889b8984fb24ba9

    // https://api.darksky.net/forecast/44f24b98cf927839b889b8984fb24ba9/37.8267,-122.4233

    @GET("forecast")
    Call<MovieResponse> getTopRatedMovies(@Path("api_key") String apiKey, @Path("lat") String lat, @Path("lon") String lon);
}
