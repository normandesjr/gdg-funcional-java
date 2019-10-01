package com.hibicode.e2.bad;

import com.hibicode.e2.bad.model.Customer;
import com.hibicode.e2.bad.model.MemberCard;

public class Discount {

    public String getDiscontLine(Customer customer) {
        return "Discount%: " + calculateDiscountPercentage(customer.getMemberCard());
    }

    private Integer calculateDiscountPercentage(MemberCard card) {
        if (card.getFidelityPoints() >= 100) {
            return 5;
        }

        if (card.getFidelityPoints() >= 50) {
            return 3;
        }

        return null;
    }

}
