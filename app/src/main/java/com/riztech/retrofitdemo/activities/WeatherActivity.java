package com.riztech.retrofitdemo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.riztech.retrofitdemo.R;
import com.riztech.retrofitdemo.api.APIInterface;
import com.riztech.retrofitdemo.api.ApiClient;
import com.riztech.retrofitdemo.api.WeatherAPIInterface;
import com.riztech.retrofitdemo.api.WeatherApiClient;
import com.riztech.retrofitdemo.models.weather.WeatherResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherActivity extends AppCompatActivity {

    private final String KEY = "44f24b98cf927839b889b8984fb24ba9";
    private final String lat = "37.8267";
    private final String lon = "-122.4233";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        final WeatherAPIInterface apiService =
                WeatherApiClient.getClient().create(WeatherAPIInterface.class);

        Call<WeatherResponse> weatherResponseCall = apiService.getWeatherData( lat, lon);

        weatherResponseCall.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                WeatherResponse weatherResponse = response.body();

                Toast.makeText(getApplicationContext(), weatherResponse.getTimezone(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {

            }
        });


    }
}
