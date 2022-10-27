package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzerMain {
    String  message;

    public MoodAnalyzerMain() {
    }

    MoodAnalyzerMain(String message){
        this.message = message;
    }
    public String analyseMood() {
        if (this.message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}