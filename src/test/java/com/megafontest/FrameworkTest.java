package com.megafontest;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FrameworkTest {
    @Ignore
    @Test
    public void testPass() {

        Assert.assertTrue(true);
    }
    @Test
    public void testPass2() {

        Assert.assertTrue(true);
    }
}
