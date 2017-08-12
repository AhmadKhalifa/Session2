package com.orange.session;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie();
        movie1.setName("Batman");
        movie1.setDate("2015");
        movie1.setDescription("Batmaaaaaaaaaaaan");
        movie1.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51MsuEnhylL.jpg");
        movie1.setRate(3.7);
        movie1.setNumOfVoters(30);
        movies.add(movie1);

        Movie movie2 = new Movie();
        movie2.setName("Spiderman");
        movie2.setDate("2001");
        movie2.setDescription("Spiderman spiderman");
        movie2.setImageUrl("https://3.bp.blogspot.com/-JNxOH51n4Bk/WQOhyaoryRI/AAAAAAAAK2U/MmciG6mNb-oyweNI4xOS9xQV1hdeJMu_wCLcB/s1600/The%2BAmazing%2BSpider-Man%2B%25282012%2529%2BHIndi%2BDual%2BAudio%2BBluRay%2BPoster.jpg");
        movie2.setRate(4.5);
        movie2.setNumOfVoters(100);
        movies.add(movie2);

        Movie movie3 = new Movie();
        movie3.setName("Super man");
        movie3.setDate("2014");
        movie3.setDescription("Superman gamed gedan");
        movie3.setImageUrl("https://vignette1.wikia.nocookie.net/dcmovies/images/0/09/Poster_-_Superman.jpg/revision/latest?cb=20130521115820");
        movie3.setRate(3.4);
        movie3.setNumOfVoters(50);
        movies.add(movie3);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        RecyclerView moviesRecyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        moviesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        moviesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        MoviesAdapter moviesAdapter = new MoviesAdapter(movies);
        moviesRecyclerView.setAdapter(moviesAdapter);
    }
}
