package com.hibicode.e3.good;

import java.util.function.BiFunction;

public class Movie {

    public enum Type {
        REGULAR(PriceService::computeReguarPrice),
        NEW_RELEASE(PriceService::computeNewReleasePrice),
        CHILDREN(PriceService::computeChildrenPrice);

        public final BiFunction<PriceService, Integer, Integer> priceAlgo;

        Type(BiFunction<PriceService, Integer, Integer> priceAlgo) {
            this.priceAlgo = priceAlgo;
        }
    }

    private final Type type;

    public Movie(Type type) {
        this.type = type;
    }

}
