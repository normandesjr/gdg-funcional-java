package com.hibicode.e3.good;

import com.hibicode.e3.good.repository.NewReleasesRepository;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.mockito.Mockito.when;

public class MovieTest {

    @Rule
    public MockitoRule mockito = MockitoJUnit.rule();

    @Mock
    private NewReleasesRepository newReleasesRepository;

    @Test
    public void should_calculate_movies_price() {
        when(newReleasesRepository.getFactor()).thenReturn(2);
        PriceService priceService = new PriceService(newReleasesRepository);

        assertThat(priceService.computePrice(Movie.Type.REGULAR, 2), is(3));
        assertThat(priceService.computePrice(Movie.Type.NEW_RELEASE, 2), is(4));
        assertThat(priceService.computePrice(Movie.Type.CHILDREN, 2), is(5));
    }

}
