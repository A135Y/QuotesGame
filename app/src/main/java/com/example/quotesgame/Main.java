package com.example.quotesgame;

public class Main {
    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        mainActivity.startNewGame();
        System.out.println("Quotes remaining: " + mainActivity.totalQuotes);
        Quotes currentQuote = mainActivity.getCurrentQuotes();
        printQuestion(currentQuote);
        // Play the game!
    }

    static void printQuestion(Quotes quote) {
        System.out.println("Question: " + quote.quotesText);
        System.out.println("Option 1: " + quote.answer0);
        System.out.println("Option 2: " + quote.answer1);
        System.out.println("Option 3: " + quote.answer2);
        System.out.println("Option 4: " + quote.answer3);
    }
}