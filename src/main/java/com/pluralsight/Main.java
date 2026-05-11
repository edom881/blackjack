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



        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Dealt card: " + deck.dealCard());
        System.out.println("Dealt card: " + deck.dealCard());

    }
}