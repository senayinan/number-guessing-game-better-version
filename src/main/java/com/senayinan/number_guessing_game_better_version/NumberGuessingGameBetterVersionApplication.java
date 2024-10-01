package com.senayinan.number_guessing_game_better_version;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class NumberGuessingGameBetterVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberGuessingGameBetterVersionApplication.class, args);

		Scanner input = new Scanner(System.in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		numberGuessingGame.startGame(input);
		input.close();
	}
}
