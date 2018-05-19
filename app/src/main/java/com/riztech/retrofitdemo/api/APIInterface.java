package com.riztech.retrofitdemo.api;

import com.riztech.retrofitdemo.models.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
