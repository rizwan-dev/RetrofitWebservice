package com.riztech.retrofitdemo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.riztech.retrofitdemo.R;
import com.riztech.retrofitdemo.api.APIInterface;
import com.riztech.retrofitdemo.api.ApiClient;
import com.riztech.retrofitdemo.models.Movie;
import com.riztech.retrofitdemo.models.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final APIInterface apiService =
                ApiClient.getClient().create(APIInterface.class);

        Call<MovieResponse> movieResponseCall = apiService.getTopRatedMovies(API_KEY);

        movieResponseCall.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {

                MovieResponse movieResponse = response.body();
                List<Movie> moviesList = movieResponse.getResults();

                Log.d("Movie list size", "Size is "+moviesList.size());
                Toast.makeText(MainActivity.this, "List size "+moviesList.size(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {

            }
        });


    }
}
