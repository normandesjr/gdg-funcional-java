package com.hibicode.e3.good;

import com.hibicode.e3.good.repository.NewReleasesRepository;

public class PriceService {

    private final NewReleasesRepository newReleasesRepository;

    public PriceService(NewReleasesRepository newReleasesRepository) {
        this.newReleasesRepository = newReleasesRepository;
    }

    public int computePrice(Movie.Type type, int days) {
        return type.priceAlgo.apply(this, days);
    }

    public int computeReguarPrice(Integer days) {
        return days + 1;
    }

    public int computeNewReleasePrice(Integer days) {
        return days * newReleasesRepository.getFactor();
    }

    public int computeChildrenPrice(Integer days) {
        return 5;
    }
}
