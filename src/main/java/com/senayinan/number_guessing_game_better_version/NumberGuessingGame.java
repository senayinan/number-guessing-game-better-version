package com.senayinan.number_guessing_game_better_version;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int randomNumber;
    private final int maximumAttempts = 10;

    public NumberGuessingGame() {
        Random random =  new Random();
        this.randomNumber = random.nextInt(100) + 1;
    }

    public void startGame(Scanner input) {
        System.out.println("Guess a number between 1-100. You have" + maximumAttempts + " chances to guess.");

        for(int i = 1; i<=maximumAttempts; i++) {
            System.out.println("Attempt " + i + ": Enter your guess: ");
            int guess = input.nextInt();
            if(guess == randomNumber)   {
                System.out.println("Congrats! You've guessed the correct number: " + randomNumber);
                break;
            }   else if(guess < randomNumber)   {
                System.out.println(guess + " is too low. Try again.");
            }   else {
                System.out.println(guess + " is too high. Try again.");
            }
            if(i == maximumAttempts)    {
                System.out.println("You've tried " + maximumAttempts + ". The correct number was" + randomNumber + ".");
            }
        }

    }
}
