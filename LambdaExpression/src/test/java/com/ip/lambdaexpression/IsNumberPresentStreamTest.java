package com.ip.lambdaexpression;

import static org.testng.Assert.assertEquals;
import java.util.stream.Stream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IsNumberPresentStreamTest {

/**
*Call to implement class of IsNumberPresentStream
*/
private IsNumberPresentStream isNumberPresentStream = null;

/**
*Create the object of implement class
*/
@BeforeTest
public void setUp() {
isNumberPresentStream = new IsNumberPresentStream();
}

/**
*First test case with is number present or not
*/
@Test
public void listOfIntegerStreamType() {
Stream<Integer> stream = Stream.of(1, 2, 3, 4);
int num = 4;
assertEquals(isNumberPresentStream
.isANumberPresentInStream(stream, num), true);
}
}