package com.bridgelabz.MoodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {
    public MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();

    @Test
    //TC 1.1
    public void testMoodAnalysis1(){
        String mood = moodAnalyzer.analyseMood("I am in sad mood");
        Assertions.assertEquals(mood, "SAD");
    }

    @Test
    //TC 1.2
    public void testMoodAnalysis2(){
        String mood = moodAnalyzer.analyseMood("I am in Any Mood");
        Assertions.assertEquals(mood, "HAPPY");
    }

}
