package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class PointTest {
@Test
    public void CompareTwoFunction(){
    int a = 100;
    int b = 10;
    int x = 1;
    int y = 21;
    Point name1 = new Point(x,y);
    boolean expected = false;
    if(y == a * x + b){expected = true;}
    boolean resultTest = name1.isrun(a,b);
    assertThat(resultTest,is(expected));
}
}