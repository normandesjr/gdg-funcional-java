package com.hibicode.e3.bad;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieTest {

    @Test
    public void should_calculate_movies_price() {
        Movie movieRegular = new Movie(Movie.Type.REGULAR);
        assertThat(movieRegular.computePrice(2), is(3));

        Movie movieNewRelease = new Movie(Movie.Type.NEW_RELEASE);
        assertThat(movieNewRelease.computePrice(2), is(4));

        Movie movieChildren = new Movie(Movie.Type.CHILDREN);
        assertThat(movieChildren.computePrice(2), is(5));
    }

}
