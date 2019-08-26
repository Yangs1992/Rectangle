package com.night.lesson.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
    private Rectangle rt;

    @Before
    public void before() {
        rt = new Rectangle(1, 2);
    }

    @Test
    public void should_get_length() {
        Assert.assertEquals(rt.getLength(), 2);
    }


    @Test
    public void should_get_width() {
        // Given
        int expectedWidth = 1;
        // when
        int actualWidth = rt.getWidth();
        // then
        Assert.assertEquals(expectedWidth, actualWidth);
    }

    @Test
    public void should_get_area() {
        //given
        int expectedArea = 2;
        //when
        int actualArea = rt.getArae();
        //then
        Assert.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void should_get_perimeter() {
        //given
        int expectedPerimeter = 2 * (2 + 1);
        //when
        int actualPerimeter = rt.getPerimeter();
        //then
        Assert.assertEquals(expectedPerimeter, actualPerimeter);
    }

}