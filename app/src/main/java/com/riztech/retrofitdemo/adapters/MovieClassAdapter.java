package com.riztech.retrofitdemo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.riztech.retrofitdemo.R;
import com.riztech.retrofitdemo.models.Movie;

import java.util.List;

/**
 * Created by rizwan on 1/11/17.
 */

public class MovieClassAdapter extends RecyclerView.Adapter<MovieHolder> {

    private List<Movie> movieList;
    private Context context;

    public MovieClassAdapter(List<Movie> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @Override
    public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieHolder holder, int position) {
        Movie result = movieList.get(position);
        holder.txtTitle.setText("Title : "+result.getTitle());
        holder.txtOverView.setText("Overview : "+result.getOverview());
        holder.txtRating.setText("Vote Count : "+result.getVoteCount());
        holder.txtVote.setText("Rating : "+result.getVoteAverage());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }



    public Movie getItem(int position) {
        return movieList.get(position);
    }
}
