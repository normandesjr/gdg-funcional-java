package com.hibicode.e2.good.model;

import java.util.Optional;

import static java.util.Optional.*;

public class Customer {

    private MemberCard memberCard;

    public Customer(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public Optional<MemberCard> getMemberCard() {
        return ofNullable(memberCard);
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }
}
