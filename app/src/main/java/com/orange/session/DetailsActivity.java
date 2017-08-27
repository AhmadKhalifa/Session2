package com.orange.session;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView titleTextView;
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        movie = (Movie) getIntent().getExtras().getSerializable("Movie");
        titleTextView = (TextView) findViewById(R.id.movie_title);
        titleTextView.setText(movie.getName());
    }
}
