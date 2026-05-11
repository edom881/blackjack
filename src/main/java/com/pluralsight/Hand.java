package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    private ArrayList<card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(card card) {
        cards.add(card);
    }

    public void displayHand() {
        for (card card : cards) {
            System.out.println(card);
        }
    }
}

