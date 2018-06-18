package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockAnglesTest {

  static final int[] HOURS = {0, 3, 12, 19};
  static final double[] MINUTES ={0, 15, 30, 42};
  static final double[] HOUR_HAND_DEGREES_TEST = {0, 97.5, 3, 231};
  static final double[] MINUTE_HAND_DEGREES_TEST = {0, 90, 180, 252};
  static final double[] HOUR_HAND_RADIANS_TEST = {1.57079, 6.15228, 1.30899, 3.82227};
  static final double[] MINUTE_HAND_RADIANS_TEST = {1.57079, 0, 4.71238, 3.45575};

  @Test
  void hourHandDegrees(int hours, double minutes) {
  }

  @Test
  void minuteHandDegrees() {
  }

  @Test
  void hourHandRadians() {
  }

  @Test
  void minuteHandRadians() {
  }
}