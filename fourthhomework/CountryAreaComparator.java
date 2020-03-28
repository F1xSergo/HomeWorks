package edu.academy.fourthhomework;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {

    @Override
    public int compare(ECountry c1, ECountry c2) {
        if (c1.getSquare() == c2.getSquare()) {
            return 0;
        }
        if (c1.getSquare() > c2.getSquare()) {
            return  1;
        } else {
            return -1;
        }
    }
}
