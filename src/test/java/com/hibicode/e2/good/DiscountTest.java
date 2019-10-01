package com.hibicode.e2.good;

import com.hibicode.e2.good.model.Customer;
import com.hibicode.e2.good.model.MemberCard;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiscountTest {

    private Discount discount;

    @Before
    public void setup() {
        this.discount = new Discount();
    }

    @Test
    public void should_return_discount_line_of_3() {
        String d1 = discount.getDiscontLine(new Customer(new MemberCard(60)));
        assertThat(d1, is("Discount%: 3"));
    }

    @Test
    public void should_return_discount_line_of_5() {
        String d1 = discount.getDiscontLine(new Customer(new MemberCard(100)));
        assertThat(d1, is("Discount%: 5"));
    }


    @Test
    public void should_not_return_discount_line() {
        String d1 = discount.getDiscontLine(new Customer(new MemberCard(10)));
        assertThat(d1, is(""));
    }

    @Test
    public void should_not_return_discount_client_without_card() {
        String d1 = discount.getDiscontLine(new Customer(null));
        assertThat(d1, is(""));
    }

}
