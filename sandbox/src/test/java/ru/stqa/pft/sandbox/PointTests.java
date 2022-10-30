package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance(){
        Point a = new Point(4,6);
        Point b = new Point(2,7);
        Assert.assertEquals(a.distance(b),2.23606797749979);
    }
    @Test
    public void testDistance2(){
        Point a = new Point(4,6);
        Point b = new Point(2,7);
        assert a.distance(b) == 2.23606797749979;
    }
}
