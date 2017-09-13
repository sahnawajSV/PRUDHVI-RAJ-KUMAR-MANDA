package com.example.movie.mymovieapp;

import java.util.ArrayList;

/**
 * Created by applemac on 12/09/17.
 */

public class MoviesDB {

    private static MoviesDB instance = null;
    private ArrayList<MovieDetails> moviesList = null;

    public static MoviesDB getInstance() {
        synchronized (MoviesDB.class) {
            if(instance == null) {
                instance = new MoviesDB();
                instance.moviesList = new ArrayList<MovieDetails>();
                ArrayList<Integer> posterList;
                ArrayList<Integer> trailersPath;
                MovieDetails details;

                posterList = new ArrayList<Integer>();
                trailersPath = new ArrayList<Integer>();
                posterList.add(R.drawable.dunkirk_v);
                posterList.add(R.drawable.dunkirk_h_1);
                details = new MovieDetails(3, "Dunkirk", "Christopher Nolan", "Action", 5f, 0, "In May 1940, Germany advanced into France, trapping Allied troops on the beaches of Dunkirk. Under air and ground cover from British and French forces, troops were slowly and methodically evacuated from the beach using every serviceable naval and civilian vessel that could be found. At the end of this heroic mission, 330,000 French, British, Belgian and Dutch soldiers were safely evacuated.", posterList, trailersPath, false);
                instance.moviesList.add(details);

                posterList = new ArrayList<Integer>();
                trailersPath = new ArrayList<Integer>();
                posterList.add(R.drawable.logan_lucky_v);
                posterList.add(R.drawable.logan_lucky_h_1);
                posterList.add(R.drawable.logan_lucky_h_2);
                details = new MovieDetails(4, "Logan Lucky", "Steven Soderbergh", "Comedy", 4.5f, 0, "West Virginia family man Jimmy Logan teams up with his one-armed brother Clyde and sister Mellie to steal money from the Charlotte Motor Speedway in North Carolina. Jimmy also recruits demolition expert Joe Bang to help them break into the track's underground system. Complications arise when a mix-up forces the crew to pull off the heist during a popular NASCAR race while also trying to dodge a relentless FBI agent.", posterList, trailersPath, false);
                instance.moviesList.add(details);

                posterList = new ArrayList<Integer>();
                trailersPath = new ArrayList<Integer>();
                posterList.add(R.drawable.thehitman_v_1);
                posterList.add(R.drawable.thehitman_h_1);
                posterList.add(R.drawable.thehitman_h_2);
                details = new MovieDetails(5, "The Hitman's Bodyguard", "Patrick Hughes", "Action", 5f, 0, "The world's top protection agent is called upon to guard the life of his mortal enemy, one of the world's most notorious hit men. The relentless bodyguard and manipulative assassin have been on the opposite end of the bullet for years and are thrown together for a wildly outrageous 24 hours. During their journey from England to the Hague, they encounter high-speed car chases, outlandish boat escapades and a merciless Eastern European dictator who is out for blood.", posterList, trailersPath, false);
                instance.moviesList.add(details);

                posterList = new ArrayList<Integer>();
                trailersPath = new ArrayList<Integer>();
                posterList.add(R.drawable.annabelle_v);
                posterList.add(R.drawable.annabelle_h_1);
                details = new MovieDetails(1, "Annabelle", "Benjamin Wallfisch", "Horror", 3f, 0, "Former toy maker Sam Mullins and his wife, Esther, are happy to welcome a nun and six orphaned girls into their California farmhouse. Years earlier, the couple's 7-year-old daughter Annabelle died in a tragic car accident. Terror soon strikes when one child sneaks into a forbidden room and finds a seemingly innocent doll that appears to have a life of its own.", posterList, trailersPath, false);
                instance.moviesList.add(details);

                posterList = new ArrayList<Integer>();
                trailersPath = new ArrayList<Integer>();
                posterList.add(R.drawable.barelilly_v);
                posterList.add(R.drawable.barelilly_h_1);
                posterList.add(R.drawable.barelilly_h_2);
                details = new MovieDetails(2, "Bareilly Ki Barfi", "Tanishk Bagchi, Rochak Kohli", "Comedy", 4.2f, 0, "Amongst the cluster of homes in Bareilly, India resides the amusing Mishra family. The only 'life loving' daughter of theirs - Bitti Mishra (Kriti Sanon) works at the electricity board, is a casual smoker, watches English movies and loves breakdance. Bitti's free spiritedness does not translate in finding a suitable groom and she resigns to being a misfit in this small-town - Bareilly. The complexities of getting married and feeling pressured, impulsive Bitty decides to run away from home. At the railway book stall, she stumbles upon a novel called 'Bareily Ki Barfi'. Surprisingly the female protagonist of the novel reads exactly like her. Is there someone like her too in this closeted town or someone who really knows and understands her?", posterList, trailersPath, false);
                instance.moviesList.add(details);
            }
            return instance;
        }
    }

    public int getCount(){
        return moviesList.size();
    }

    public MovieDetails getMovieDetailsByIndex(int index) {
        if(moviesList.size() >= index) {
            return null;
        }
        return moviesList.get(index);
    }

    public MovieDetails getMovieDetailsById(long movieId) {
        MovieDetails details = null;
        for (MovieDetails d: moviesList) {
            if(d.getId() == movieId) {
                details = d;
                break;
            }
        }
        return details;
    }
}
