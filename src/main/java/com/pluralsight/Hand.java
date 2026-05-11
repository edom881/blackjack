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
    public int getScore() {
        int score = 0;
        int aceCount = 0;

        for (card card : cards) {
            String value = card.getValue();

            if (value.equals("Ace")) {
                score += 11;
                aceCount++;
            } else if (value.equals("King") || value.equals("Queen") || value.equals("Jack")) {
                score += 10;
            } else {
                score += Integer.parseInt(value);
            }
        }

        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }

        return score;
    }
}

