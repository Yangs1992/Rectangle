package com.night.lesson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rt;

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

        // when

        // then
        Assert.assertEquals(rt.getWidth(), 1);
    }

    @Test
    public void should_get_area() {
        Assert.assertEquals(rt.getArae(), 2);
    }

    @Test
    public void should_get_perimeter(){
        Assert.assertEquals(rt.getPerimeter(), 2 * ( 2 + 1 ));
    }


}