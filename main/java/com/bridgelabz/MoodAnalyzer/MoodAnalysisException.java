package com.bridgelabz.MoodAnalyzer;

public class MoodAnalysisException extends Exception {
    public enum Exception_Type {
        NULL, EMPTY
    }

    public Exception_Type type;

    public MoodAnalysisException(Exception_Type type, String message) {
        super(message);
        this.type=type;
    }
}