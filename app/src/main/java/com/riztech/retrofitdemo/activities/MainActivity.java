package com.riztech.retrofitdemo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.riztech.retrofitdemo.R;
import com.riztech.retrofitdemo.adapters.MovieClassAdapter;
import com.riztech.retrofitdemo.api.APIInterface;
import com.riztech.retrofitdemo.api.ApiClient;
import com.riztech.retrofitdemo.models.Movie;
import com.riztech.retrofitdemo.models.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView moviesList;

    public static final String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";
    private MovieClassAdapter mMovieClassAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesList = findViewById(R.id.moviesList);

        final APIInterface apiService =
                ApiClient.getClient().create(APIInterface.class);

        Call<MovieResponse> movieResponseCall = apiService.getTopRatedMovies(API_KEY);

        movieResponseCall.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {

                MovieResponse movieResponse = response.body();
                List<Movie> movies = movieResponse.getResults();

                mMovieClassAdapter = new MovieClassAdapter(movies, MainActivity.this);
                moviesList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                moviesList.setAdapter(mMovieClassAdapter);
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {

            }
        });


    }
}
