package com.example.quotesgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
public static String TAG = "MainActivity";


    int currentQuoteIndex;
    int totalCorrect;
    int totalQuotes;

    ArrayList<Quotes> quotes;

    ImageView quotesImageView;
    TextView quotesTextView;
    TextView quotesRemainingTextView;
    Button answer0Button;
    Button answer1Button;
    Button answer2Button;
    Button answer3Button;
    Button submitButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_unquote_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setElevation(0);

        setContentView(R.layout.activity_main);
        quotesImageView = findViewById(R.id.iv_main_quote_image);
        quotesTextView = findViewById(R.id.tv_main_quotes_title);
        quotesRemainingTextView = findViewById(R.id.tv_main_quotes_remaining_count);
        answer0Button = findViewById(R.id.btn_main_answer_1);
        answer1Button = findViewById(R.id.btn_main_answer_2);
        answer2Button = findViewById(R.id.btn_main_answer_3);
        answer3Button = findViewById(R.id.btn_main_answer_4);
        submitButton = findViewById(R.id.btn_main_submit_answer);

       answer0Button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onAnswerSelected(0);
           }
       });

       answer1Button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onAnswerSelected(1);
           }
       });

       answer2Button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onAnswerSelected(2);
           }
       });

       answer3Button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onAnswerSelected(3);
           }
       });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getCurrentQuotes().playerAnswer != -1) {
                    onAnswerSubmission();
                }
                else {
                    AlertDialog.Builder invalidAnswerDialog = new AlertDialog.Builder(MainActivity.this);
                    invalidAnswerDialog.setCancelable(true);
                    invalidAnswerDialog.setTitle("No Selection Made");
                    invalidAnswerDialog.setMessage("Please Choose an answer");
                    invalidAnswerDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    invalidAnswerDialog.create().show();
                }

            }
        });
        startNewGame();
    }


     void displayQuotes(Quotes quotes) {
        answer0Button.setText(quotes.answer0);
        answer1Button.setText(quotes.answer1);
        answer2Button.setText(quotes.answer2);
        answer3Button.setText(quotes.answer3);
        quotesTextView.setText(quotes.quotesText);
        quotesImageView.setImageResource(quotes.imageId);
     }

      public void displayQuotesRemaining(int quotesRemaining){
        quotesRemainingTextView.setText(quotesRemaining +"");
       }

    // TODO 4-A: onAnswerSelected(int answerSelected) {...}

    void startNewGame(){
        Quotes quote1 = new Quotes(
                R.drawable.pexels_photo_1000366,
                "I'm not one of those people who believes in going endlessly around finger " +
                          "wagging and ticking people off for occasional colourful use of language.",
                "Elvis Presley",
                "Boris Johnson",
                "Micheal Jackson",
                "Todd Parsons",
                1);

        Quotes quote2 = new Quotes(
                R.drawable.pexels_photo_2110951,
                "Darkness cannot drive out darkness; only light can do that.",
                "Mathew McConaughey",
                "John Carmack",
                "Barack Obama",
                "Martin Luther King",
                3);

        Quotes quote3 = new Quotes(
                R.drawable.pexels_photo_2425036,
                "You know you must be doing something right if old people like you.",
                "Dave Chappelle",
                "Jerry Seinfeld",
                "Eddie Murphy",
                "Donald Trump",
                0
        );

        Quotes quote4 = new Quotes(
                R.drawable.pexels_photo_2860807,
                "Tell me and I forget. Teach me and I remember. Involve me and I learn.",
                "George Bush",
                "Bill CLinton",
                "Benjamin" +
                           "Franklin",
                "John F Kennedy",
                2
        );

        Quotes quote5 = new Quotes(
                R.drawable.pexels_photo_3651579,
                "Some people don't like change, but you need to embrace change if the alternative is disaster..",
                "Elon Musk",
                "Jeff Bezos",
                "Jack Ma",
                "Bill Gates",
                0
        );
        Quotes quote6 = new Quotes(
                R.drawable.pexels_photo_3799324,
                "If you destroy a free market you create a black market.",
                "Joe Biden",
                "Nelson Mandela",
                "Trevor Noah",
                "Winston Churchill",
                3
        );
        Quotes quote7 = new Quotes(
                R.drawable.pexels_photo_3844786,
                "Be a yardstick of quality. Some people aren’t used to an environment where excellence is expected.",
                "Margaret Thatcher",
                "Steve Jobs",
                "Gandhi",
                "Harry Styles",
                1
        );
        Quotes quote8 = new Quotes(
                R.drawable.pexels_photo_3844788,
                "I'm out for Presidents to represent me.",
                "Common",
                "P Diddy",
                "Nas",
                "50 Cent",
                2
        );
        Quotes quote9 = new Quotes(
                R.drawable.pexels_photo_3844790,
                "A winner is a dreamer who never gives up.",
                "Usain Bolt",
                "Lionel Messi",
                "Conor McGregor",
                "Nelson Mandela",
                3
        );
        Quotes quote10 = new Quotes(
                R.drawable.pexels_photo_3844796,
                "You will face many defeats in life, but never let yourself be defeated.",
                "Mother Theresa",
                "Peter Parker",
                "Maya Angelou",
                "Ronald Reagan",
                2
        );
        Quotes quote11 = new Quotes(
                R.drawable.pexels_photo_3848670,
                "Gosh, it’s not like the internet to go crazy about something small and stupid.",
                "Kendal Jenner",
                "Peter Griffin",
                "Ben Affleck",
                "Kevin Hart",
                1
        );
        Quotes quote12 = new Quotes(
                R.drawable.pexels_photo_5071339,
                "Revenge is a dish that tastes best when it is cold.",
                "The Godfather",
                "The Sopranos",
                "Breaking Bad",
                "Shutter Island",
                0
        );
        Quotes quote13 = new Quotes(
                R.drawable.pexels_photo_5186869,
                "To Protect The Sheep You Gotta Catch The Wolf, And It Takes A Wolf To Catch A Wolf",
                "The Irishman",
                "Brooklyn 99",
                "Training Day",
                "Starsky & Hutch",
                2
        );
        Quotes quote14 = new Quotes(
                R.drawable.pexels_photo_6273478,
                "Her heart will go on, but whose heart is it?",
                "Whitney Houston",
                "Diana Ross",
                "Celine Dion",
                "Mariah Carey",
                1
        );
        Quotes quote15 = new Quotes(
                R.drawable.pexels_photo_6273480,
                "You got a dream... You gotta protect it. People can't do somethin' themselves, they wanna tell you you can't do it. " +
                        "If you want somethin, go get it. Period. " +
                        "\nHere’s the truth, Will Smith did say this, but in which movie?",
                "Independence Day",
                "Bad Boys",
                "Men In Black",
                "The Pursuit of Happiness",
                3
        );

        quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);
        quotes.add(quote5);
        quotes.add(quote6);
        quotes.add(quote7);
        quotes.add(quote8);
        quotes.add(quote9);
        quotes.add(quote10);
        quotes.add(quote11);
        quotes.add(quote12);
        quotes.add(quote13);
        quotes.add(quote14);
        quotes.add(quote15);

        totalCorrect = 0;
        totalQuotes = quotes.size();

        Quotes firstQuote = chooseNewQuotes();

      displayQuotes(firstQuote);

      displayQuotesRemaining(quotes.size());

    }

    Quotes chooseNewQuotes(){
        int num = generateRandomNumber(quotes.size());
        currentQuoteIndex = num;
        return quotes.get(currentQuoteIndex);
    }

    Quotes getCurrentQuotes(){
        Quotes currentQuote = quotes.get(currentQuoteIndex);
        return currentQuote;
    }

    void onAnswerSelected(int answerSelected) {
        Quotes currentQuote = getCurrentQuotes();
        currentQuote.playerAnswer = answerSelected;
         answer0Button.setText(currentQuote.answer0);
         answer1Button.setText(currentQuote.answer1);
         answer2Button.setText(currentQuote.answer2);
         answer3Button.setText(currentQuote.answer3);

        switch(answerSelected){
            case 0: answer0Button.setText("✔" + currentQuote.answer0);
            break;
            case 1: answer1Button.setText("✔" + currentQuote.answer1);
            break;
            case 2: answer2Button.setText("✔" + currentQuote.answer2);
            break;
            case 3: answer3Button.setText("✔" + currentQuote.answer3);
        }
        if(currentQuote.playerAnswer == -1){
            return;
        }
    }

    void onAnswerSubmission(){
        Quotes currentQuote = getCurrentQuotes();
        if (currentQuote.isCorrect()) {
            totalCorrect++;
        }
        quotes.remove(currentQuote);

         displayQuotesRemaining(quotes.size());

        if (quotes.size() == 0) {
            String gameOverMessage = getGameOverMessage(totalCorrect, totalQuotes);

            AlertDialog.Builder gameOverDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            gameOverDialogBuilder.setCancelable(false);
            gameOverDialogBuilder.setTitle("Game Over!");
            gameOverDialogBuilder.setMessage(gameOverMessage);
            gameOverDialogBuilder.setPositiveButton("Play Again!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    startNewGame();
                }
            });
            gameOverDialogBuilder.create().show();

        } else {
            chooseNewQuotes();
             displayQuotes(getCurrentQuotes());
        }
    }
    int generateRandomNumber( int max){
        double randNum = Math.random() * max;
        return (int) randNum;
    }

    String getGameOverMessage(int totalCorrect, int totalQuotes){
        if(totalCorrect == totalQuotes){
            return "You got all 20 right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " + totalQuotes + ". Better luck next time!";
        }
    }

}