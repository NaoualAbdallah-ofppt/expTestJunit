package com.example.exptestjunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class ExampleUnitTest {
     @Test
    public void testAdd()
    {
        int a =5;
        int b=10;
        Operations C= new Operations();
        int s=C.add(a,b);
        assertEquals(15, s);
    }
    @Test
    public void testAddnegatif()
    {
        int a =-5;
        int b=-10;
        Operations C= new Operations();
        int s=C.add(a,b);
        assertEquals(-15, s);
    }
}