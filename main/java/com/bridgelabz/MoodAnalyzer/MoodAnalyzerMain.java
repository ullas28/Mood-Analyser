package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzerMain {
    private String message;
    /**
     * create a default constructor name as MoodAnalyserMain
     */
    public MoodAnalyzerMain() {
    }

    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}