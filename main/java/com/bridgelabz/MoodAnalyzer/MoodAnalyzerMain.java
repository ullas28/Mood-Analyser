package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzerMain {
    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}