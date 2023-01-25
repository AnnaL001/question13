package com.anna.question13.time;

import static java.lang.Integer.parseInt;

public class TimeIn24Hours extends Time {
  public static final String PATTERN = "[0-9]{2}:[0-9]{2}";
  private static final String PATTERN_ERROR_MESSAGE = "Time format should be a string, only containing digits that follow the pattern(two digits, colon then two digits) like 16:45 where hours = 16 and minutes = 45";

  public TimeIn24Hours(String time) {
    if(getPatternValidity(time, PATTERN_ERROR_MESSAGE)){
      this.hours = parseInt(time.substring(0,2));
      this.minutes = parseInt(time.substring(3));
    }
  }

  @Override
  protected boolean getHoursValidity(int hours) {
    if(hours > -1 && hours < 24){
      return true;
    } else {
      System.out.println("Hours value should be within range 0 - 23");
      return false;
    }
  }

  @Override
  protected boolean getMinutesValidity(int minutes) {
    if(minutes > -1 && minutes < 60){
      return true;
    } else {
      System.out.println("Minutes value should be within range 0 - 59");
      return false;
    }
  }
}
