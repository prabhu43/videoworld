package com.thoughtworks.videorental.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Movie {


    private static final double NEW_MOVIE_BASE_PRICE_FOR_THRESHOLD_DAYS = 3;
    private static final double EXTRA_PRICE_FOR_NEW_MOVIES = 2;
    private static final double PRICE_FOR_OLD_MOVIES = 1;
    private static final int NEW_MOVIE_DAYS_THRESHOLD = 2;

    private String title;
    private Boolean isNew;

    public Movie(String title, Boolean isNew) {
        this.title = title;
        this.isNew = isNew;
    }

    public Movie(String title) {
        this.title = title;
        this.isNew = false;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(final int daysRented) {

        if (isNew) {
            if (daysRented <= NEW_MOVIE_DAYS_THRESHOLD ) {
                return NEW_MOVIE_BASE_PRICE_FOR_THRESHOLD_DAYS;
            }
            else {
                return NEW_MOVIE_BASE_PRICE_FOR_THRESHOLD_DAYS + ((daysRented - NEW_MOVIE_DAYS_THRESHOLD) * EXTRA_PRICE_FOR_NEW_MOVIES);
            }
        } else return daysRented * PRICE_FOR_OLD_MOVIES;
    }


}
