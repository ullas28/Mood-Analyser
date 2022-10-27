package com.bridgelabz.MoodAnalyzer;

import org.junit.jupiter.api.*;

public class MoodAnalyserTest {
    MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
    @Test
    //TC 2.1 Given Null Mood Should Return Happy
    public void testMoodAnalysis1(){
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }

}
