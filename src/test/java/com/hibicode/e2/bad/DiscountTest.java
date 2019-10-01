package com.hibicode.e2.bad;

import com.hibicode.e2.bad.model.Customer;
import com.hibicode.e2.bad.model.MemberCard;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiscountTest {

    @Test
    public void should_return_discount_line() {
        Discount discount = new Discount();
        String d1 = discount.getDiscontLine(new Customer(new MemberCard(60)));
        assertThat(d1, is("Discount%: 3"));
    }

    @Test
    public void should_not_return_discount_line() {
        Discount discount = new Discount();
        String d1 = discount.getDiscontLine(new Customer(new MemberCard(10)));
        // Bad code makes difficult to do tests...
//        assertThat(d1, is(""));
    }

}
