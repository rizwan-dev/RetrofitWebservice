package com.riztech.retrofitdemo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.riztech.retrofitdemo.R;

class MovieHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtOverView, txtRating, txtVote;

        public MovieHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView)itemView.findViewById(R.id.txtTitle);
            txtOverView = (TextView)itemView.findViewById(R.id.txtOverView);
            txtRating = (TextView)itemView.findViewById(R.id.txtRating);
            txtVote = (TextView)itemView.findViewById(R.id.txtVote);

        }
    }