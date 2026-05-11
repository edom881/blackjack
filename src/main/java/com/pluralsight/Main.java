package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!");

        System.out.print("Enter player 1 name: ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter player 2 name: ");
        String player2Name = scanner.nextLine();

        System.out.println();
        System.out.println("Player 1: " + player1Name);
        System.out.println("Player 2: " + player2Name);


        //Deck deck = new Deck();
        // deck.shuffle();

        //System.out.println("Dealt card: " + deck.dealCard());
        // System.out.println("Dealt card: " + deck.dealCard());
        Deck deck = new Deck();
        deck.shuffle();

        // create player hands
        Hand player1Hand = new Hand();
        Hand player2Hand = new Hand();

// deal 2 cards to each player
        player1Hand.addCard(deck.dealCard());
        player1Hand.addCard(deck.dealCard());

        player2Hand.addCard(deck.dealCard());
        player2Hand.addCard(deck.dealCard());

// display hands
        System.out.println();
        System.out.println(player1Name + "'s Hand:");
        player1Hand.displayHand();

        System.out.println();
        System.out.println(player2Name + "'s Hand:");
        player2Hand.displayHand();

        int player1Score = player1Hand.getScore();
        int player2Score = player2Hand.getScore();

        System.out.println();

        if (player1Score > 21 && player2Score > 21) {
            System.out.println("Both players busted. No winner.");
        } else if (player1Score > 21) {
            System.out.println(player2Name + " wins!");
        } else if (player2Score > 21) {
            System.out.println(player1Name + " wins!");
        } else if (player1Score > player2Score) {
            System.out.println(player1Name + " wins!");
        } else if (player2Score > player1Score) {
            System.out.println(player2Name + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}