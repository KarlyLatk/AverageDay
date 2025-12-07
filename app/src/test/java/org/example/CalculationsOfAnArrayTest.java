package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsOfAnArrayTest {
    CalculationsOfAnArray calculations;
    int[] nums;
    double average;
    int[] emptyNums;
    @BeforeEach
    void setUp() {
        nums = new int[]{2, 4, 10, 12, 14, 5};
        emptyNums = new int[]{};
        average = (double) 47 /6;
        calculations = new CalculationsOfAnArray();
    }

    @Test
    void maximumUsingForLoopTest() {
        assertEquals(14, calculations.maximumUsingForLoop(nums));
        assertEquals(0, calculations.maximumUsingForLoop(emptyNums));
    }

    @Test
    void minimumUsingForLoopTest() {
        assertEquals(2, calculations.minimumUsingForLoop(nums));
        assertEquals(Integer.MAX_VALUE, calculations.minimumUsingForLoop(emptyNums));
    }

    @Test
    void sumUsingForLoopTest() {
        assertEquals(47, calculations.sumUsingForLoop(nums));
        assertEquals(0, calculations.sumUsingForLoop(emptyNums));
    }

    @Test
    void averageUsingForLoopTest() {
        assertEquals(average, calculations.averageUsingForLoop(nums));
    }

    @Test
    void maximumUsingStreamTest() {
        assertEquals(14, calculations.maximumUsingStream(nums));
        assertEquals(0, calculations.maximumUsingStream(emptyNums));
    }

    @Test
    void minimumUsingStreamTest() {
        assertEquals(2, calculations.minimumUsingStream(nums));
        assertEquals(Integer.MAX_VALUE, calculations.minimumUsingStream(emptyNums));
    }

    @Test
    void sumUsingStreamTest() {
        assertEquals(47, calculations.sumUsingStream(nums));
        assertEquals(0, calculations.sumUsingStream(emptyNums));
    }

    @Test
    void averageUsingStreamTest() {
        assertEquals(average, calculations.averageUsingStream(nums));
        assertEquals(0, calculations.averageUsingStream(emptyNums));
    }

    @Test
    void returnEvensOnlyTest() {
        assertArrayEquals(new int[]{2, 4, 10, 12, 14}, calculations.returnEvensOnly(nums));
    }

    @Test
    void returnOddsOnlyTest() {
        assertArrayEquals(new int[] {5}, calculations.returnOddsOnly(nums));
    }

    @Test
    void addFiveTest() {
        assertArrayEquals(new int[]{7, 9, 15, 17, 19, 10}, calculations.addFive(nums));
    }

    @Test
    void squareNumbersTest() {
        assertArrayEquals(new int[]{4, 16, 100, 144, 196, 25}, calculations.squareNumbers(nums));
    }
}