package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenSad_ReturnsSad() throws MoodAnalyserException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a sad mood");
        String mood = moodAnalyser.moodAnalysis();
        Assert.assertEquals("sad",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ReturnsHappy() throws MoodAnalyserException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalysis("Happy");
        Assert.assertEquals("Happy",mood);
    }
    @Test
    public void givenMessage_WhenNull_ReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.moodAnalysis("Happy");
        }
        catch (MoodAnalyserException e)
        {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.getType());
        }
    }

    @Test
    public void givenMessage_WhenEmpty_ReturnSad()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        try
        {
            moodAnalyzer.moodAnalysis("sad");
        }
        catch (MoodAnalyserException e)
        {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,e.getType());
        }
    }
}
