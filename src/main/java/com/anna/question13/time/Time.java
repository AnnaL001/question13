package com.anna.question13.time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Time {
  protected int hours;
  protected int minutes;
  protected static final String PATTERN = "";
  protected static final String PATTERN_ERROR_MESSAGE = "Time regex pattern is incorrect";

  public int getHours() {
    return hours;
  }

  public int getMinutes() {
    return minutes;
  }

  public boolean getTimeValidity(){
    return this.getHoursValidity(this.hours) && this.getMinutesValidity(this.minutes);
  }

  protected boolean getPatternValidity(String input, String errorMessage){
    Pattern pattern = Pattern.compile(Time.PATTERN);
    Matcher patternMatcher = pattern.matcher(input);

    if(patternMatcher.find()){
      return true;
    } else {
      System.out.println(errorMessage);
      return false;
    }
  }

  protected abstract boolean getHoursValidity(int hours);
  protected abstract boolean getMinutesValidity(int minutes);
}
