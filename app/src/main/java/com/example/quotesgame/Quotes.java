package com.example.quotesgame;
public class Quotes {
    int imageId;
    String quotesText;
    String answer0;
    String answer1;
    String answer2;
    String answer3;
    int correctAnswer;
    int playerAnswer;

    public Quotes(int imageIdentifier,
                  String quoteString,
                  String answerZero,
                  String answerOne,
                  String answerTwo,
                  String answerThree,
                  int correctAnswerIndex)
    {
        imageId = imageIdentifier;
        quotesText = quoteString;
        answer0 = answerZero;
        answer1 = answerOne;
        answer2 = answerTwo;
        answer3 = answerThree;
        correctAnswer = correctAnswerIndex;
        playerAnswer = -1;
    }


    boolean isCorrect(){
        if(playerAnswer == correctAnswer){
            return true;
        }else{
        return false;
        }
    }
}
