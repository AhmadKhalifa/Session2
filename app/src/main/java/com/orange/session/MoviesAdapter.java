package com.orange.session;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Locale;

/**
 * Created by Khalifa on 8/12/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

    private List<Movie> movies;

    public MoviesAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutHolderView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.list_item_movie,
                parent,
                false);
        return new MoviesViewHolder(layoutHolderView);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        holder.setContent(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder{

        ImageView posterImageView;
        TextView nameTextView;
        TextView dateTextView;
        TextView rateTextView;
        TextView descriptionTextView;
        TextView votersTextView;

        public MoviesViewHolder(View itemView) {
            super(itemView);
            posterImageView = (ImageView) itemView.findViewById(R.id.movie_poster_image_view);
            nameTextView = (TextView) itemView.findViewById(R.id.movie_name_text_view);
            dateTextView = (TextView) itemView.findViewById(R.id.movie_date_text_view);
            rateTextView = (TextView) itemView.findViewById(R.id.movie_rate_text_view);
            descriptionTextView = (TextView) itemView.findViewById(R.id.movie_description_text_view);
            votersTextView = (TextView) itemView.findViewById(R.id.movie_voters_count_text_view);
        }

        public void setContent(Movie movie) {
            Picasso.with(posterImageView.getContext()).load(movie.getImageUrl()).into(posterImageView);
            nameTextView.setText(movie.getName());
            dateTextView.setText(movie.getDate());
            rateTextView.setText(String.format(Locale.getDefault(), "%.2f", movie.getRate()));
            descriptionTextView.setText(movie.getDescription());
            votersTextView.setText(String.format(Locale.getDefault(), "%d", movie.getNumOfVoters()));
        }

    }
}
