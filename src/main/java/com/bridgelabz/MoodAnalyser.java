package com.bridgelabz;

public class MoodAnalyser
{
    private String message;
    public MoodAnalyser()
    {

    }
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    public String moodAnalysis()
    {
            if (this.message.contains("sad"))
                return "sad";
            else
                return "Happy";
    }
}
