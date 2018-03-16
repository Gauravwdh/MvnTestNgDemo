package com.tapzo.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

  @Test
  public void demoTest() {
    Assert.assertEquals(2, 2);
  }

  @Test
  public void demoTest2() {
    Assert.assertEquals(2, 2);
  }


  @Test
  public void demoTest3() {
    Assert.assertEquals(2, 3);
  }
}
