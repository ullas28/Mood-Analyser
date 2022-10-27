package com.bridgelabz.MoodAnalyzer;

import org.junit.jupiter.api.*;

public class MoodAnalyserTest {
    MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain(null);

    //TC 3.1 Given NULL Mood Should Throw MoodAnalysisException
    @Test
    public void testMoodAnalysis1() throws MoodAnalysisException{
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }

    //Given Empty Mood Should Throw MoodAnalysisException indicating Empty

    MoodAnalyzerMain moodAnalyzer2 = new MoodAnalyzerMain("");
    @Test
    public void testMoodAnalysis2() throws MoodAnalysisException {
        String mood2 = moodAnalyzer2.analyseMood();
        System.out.println(mood2);
        Assertions.assertEquals(mood2, "HAPPY");
    }

}
