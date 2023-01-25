package com.anna.question13.time.factory;

import com.anna.question13.time.TimeIn24Hours;

public class TimeFactoryIn24HoursImpl implements TimeFactoryIn24Hours {
  public TimeFactoryIn24HoursImpl() {
  }

  @Override
  public TimeIn24Hours createInstance(String time) {
    return new TimeIn24Hours(time);
  }
}
