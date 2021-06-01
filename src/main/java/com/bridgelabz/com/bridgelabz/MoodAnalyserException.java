package com.bridgelabz.com.bridgelabz;

public class MoodAnalyserException extends Exception
{
    public enum ExceptionType
    {
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;
    public ExceptionType getType()
    {
        return type;
    }
    public MoodAnalyserException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
