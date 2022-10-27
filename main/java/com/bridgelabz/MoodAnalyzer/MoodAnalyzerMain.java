package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzerMain {
    private String message;
    /**
     * create a default constructor name as MoodAnalyzerMain
     */
    public MoodAnalyzerMain() {
    }

    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else if (message.contains("")){
                throw new MoodAnalysisException(MoodAnalysisException.Exception_Type.EMPTY, "Please provide valid mood, dont keep empty in arguments");
            }
            else
                return "HAPPY";
        }
        catch (Exception e) {
            if (this.message == null) {
                throw new MoodAnalysisException(MoodAnalysisException.Exception_Type.NULL, "Please provide valid mood, dont provide null in arguments");
            }
            else
                throw new MoodAnalysisException(MoodAnalysisException.Exception_Type.EMPTY, "Please provide valid mood, dont keep empty in arguments");
        }
    }
}