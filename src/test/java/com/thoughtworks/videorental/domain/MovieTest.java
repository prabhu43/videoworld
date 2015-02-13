package com.thoughtworks.videorental.domain;

import junit.framework.TestCase;
import org.junit.Test;

public class MovieTest extends TestCase {

    @Test
    public void testCorrectChargeForNewMoviesForRentUptoTwoDays() {
        Movie newMovie = new Movie("Up in the Air", true);
        assertEquals(3.0, newMovie.getCharge(2));
    }

    @Test
    public void testCorrectChargeForNewMoviesForRentMoreThan2Days() {
        Movie newMovie = new Movie("Up in the Air", true);
        assertEquals(7.0, newMovie.getCharge(4));
    }

    @Test
    public void testCorrectChargeForOldMovie() {
        Movie newMovie = new Movie("Up in the Air", false);
        assertEquals(10.0, newMovie.getCharge(10));
    }



}