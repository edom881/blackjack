package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<card> cards;

    public Deck() {
        cards = new ArrayList<>();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new card(suit, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public card dealCard() {
        return cards.remove(0);
    }

}
