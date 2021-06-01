package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.MoodAnalyserException;

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
    public String moodAnalysis(String message) throws MoodAnalyserException
    {
        this.message = message;
        return moodAnalysis();
    }
    public String moodAnalysis() throws MoodAnalyserException
    {
        try
        {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"ENTER A PROPER MESSAGE");
            if (message.contains("I am in a sad mood"))
                return "sad";
                return "Happy";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"ENTER A PROPER MESSAGE");
        }
    }
}
