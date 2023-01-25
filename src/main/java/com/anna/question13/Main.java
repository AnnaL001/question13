package com.anna.question13;

import com.anna.question13.time.Time;
import com.anna.question13.time.TimeIn24Hours;
import com.anna.question13.time.factory.TimeFactoryIn24Hours;
import com.anna.question13.time.factory.TimeFactoryIn24HoursImpl;

public class Main {
  static TimeFactoryIn24Hours timeFactory = new TimeFactoryIn24HoursImpl();
  public static void main(String[] args) {
    String[] testData = {"13:58", "25:51", "02:76"};
    runTests(testData);
  }

  public static void runTests(String[] testData){
    for (String element: testData) {
      Time timeInstance = new TimeIn24Hours(element);
      System.out.println(element + " = " + timeInstance.getTimeValidity());
    }
  }
}