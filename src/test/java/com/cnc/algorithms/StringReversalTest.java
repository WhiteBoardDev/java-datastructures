package com.cnc.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReversalTest {

  @Test
  public void reverseStringHappy() {
    
      String actual = "ABCD";
      String expected = "DCBA";
      
      String result = StringReversal.reverse(actual);
      assertEquals(expected, result);
    
  }
}
