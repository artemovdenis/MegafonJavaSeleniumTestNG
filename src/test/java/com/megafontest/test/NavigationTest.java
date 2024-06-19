package com.megafontest.test;
import com.megafontest.base.BaseTest;
import com.megafontest.data.TestData;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



public class NavigationTest extends BaseTest {

    @Test
    public void testOpenBaseURL() {
        final String expectedURL = TestData.BASE_URL;
        getDriver().get(TestData.BASE_URL);
        final String actualURL = getDriver().getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);


    }

}
