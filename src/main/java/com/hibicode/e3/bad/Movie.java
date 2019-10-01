package com.hibicode.e3.bad;

public class Movie {

    enum Type {
        REGULAR, NEW_RELEASE, CHILDREN
    }

    private final Type type;

    public Movie(Type type) {
        this.type = type;
    }

    public int computePrice(int days) {
        switch (type) {
            case REGULAR: return days + 1;
            case NEW_RELEASE: return days * 2;
            case CHILDREN: return 5;
            default: throw new IllegalArgumentException();
        }
    }

}
