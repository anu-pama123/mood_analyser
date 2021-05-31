package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenSad_ReturnsSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a sad mood");
        String mood = moodAnalyser.moodAnalysis();
        Assert.assertEquals("sad",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ReturnsHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalysis();
        Assert.assertEquals("Happy",mood);
    }

}
