package com.example.quotesgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MainActivityTest {

    @Before
       public void testCase(){
    Quotes newQuote = new Quotes(
            R.drawable.pexels_photo_12159027,
            "Who let the dogs out",
            "Maroon 5",
            "Some Singer",
            "Baha Men",
            "Black Eyed Peas",
            2
    );
        ArrayList<Quotes> testQuotes;
        testQuotes = new ArrayList<>();
        testQuotes.add(newQuote);
       Integer totalTestQuotes = testQuotes.size();
}



    @Test
    public void chooseNewQuotes() {

    }

    @Test
    public void getCurrentQuotes() {
    }

    @Test
    public void onAnswerSelected() {
    }

    @Test
    public void onAnswerSubmission() {
    }

    @Test
    public void generateRandomNumber(int totalTestQuotes) {
    }

    @Test
    public void getGameOverMessage() {
    }
}