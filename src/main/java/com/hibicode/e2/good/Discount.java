package com.hibicode.e2.good;

import com.hibicode.e2.good.model.Customer;
import com.hibicode.e2.good.model.MemberCard;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class Discount {

    public String getDiscontLine(Customer customer) {
        return customer.getMemberCard()
                .flatMap(this::calculateDiscountPercentage)
                .map(d -> "Discount%: " + d)
                .orElse("");
    }

    private Optional<Integer> calculateDiscountPercentage(MemberCard card) {
        if (card == null) {
            return empty();
        }

        if (card.getFidelityPoints() >= 100) {
            return of(5);
        }

        if (card.getFidelityPoints() >= 50) {
            return of(3);
        }

        return empty();
    }

}
