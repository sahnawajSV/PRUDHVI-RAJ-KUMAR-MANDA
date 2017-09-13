package com.example.movie.mymovieapp;

import java.util.ArrayList;

/**
 * Created by applemac on 12/09/17.
 */

public class MovieDetails {

    private long id;
    private String name;
    private String cast;
    private String genre;
    private float rating;
    private long releaseDate;
    private ArrayList<Integer> postersPath;
    private ArrayList<Integer> trailersPath;
    private String desc;
    private boolean favorite;

    public MovieDetails() {
        postersPath = new ArrayList<Integer>();
        trailersPath = new ArrayList<Integer>();
    }

    public MovieDetails(long id, String name, String cast, String genre, float rating, long releaseDate, String desc, ArrayList<Integer> postersPath, ArrayList<Integer> trailersPath, boolean favorite) {
        this.id = id;
        this.name = name;
        this.cast = cast;
        this.genre = genre;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.postersPath = postersPath;
        this.trailersPath = trailersPath;
        this.desc = desc;
        this.favorite = favorite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<Integer> getPostersPath() {
        return postersPath;
    }

    public void setPostersPath(ArrayList<Integer> postersPath) {
        this.postersPath = postersPath;
    }

    public ArrayList<Integer> getTrailersPath() {
        return trailersPath;
    }

    public void setTrailersPath(ArrayList<Integer> trailersPath) {
        this.trailersPath = trailersPath;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
