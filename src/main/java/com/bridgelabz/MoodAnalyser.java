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
        try
        {
            if (this.message.contains("sad"))
                return "sad";
        }
        catch (NullPointerException ex)
        {
            return "Happy";
        }
        return "Happy";
    }
}
