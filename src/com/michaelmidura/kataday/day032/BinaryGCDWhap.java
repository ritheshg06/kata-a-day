package com.michaelmidura.kataday.day032;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGCDWhap {
    @Test
    public void doTest() {
        assertEquals(6, BinaryGCD.gcdBinary(666666, 333111));
        assertEquals(1, BinaryGCD.gcdBinary(545034, 5));
        assertEquals(0, BinaryGCD.gcdBinary(0, 0));
        assertEquals(14, BinaryGCD.gcdBinary(0, 76899299));
        assertEquals(1, BinaryGCD.gcdBinary(-124, -16));
    }
}