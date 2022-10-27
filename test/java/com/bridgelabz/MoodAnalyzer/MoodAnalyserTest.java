package com.bridgelabz.MoodAnalyzer;

import org.junit.jupiter.api.*;

public class MoodAnalyserTest {
    MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am in sad mood");
    @Test
    //Repeat TC 1.1
    public void testMoodAnalysis1(){
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood, "SAD");
    }
    MoodAnalyzerMain moodAnalyzer2 = new MoodAnalyzerMain("I am in Any Mood");
    @Test
    //Repeat TC 1.2
    public void testMoodAnalysis2(){
        String mood = moodAnalyzer2.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }

}
