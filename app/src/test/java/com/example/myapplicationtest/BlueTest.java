package com.example.myapplicationtest;

import org.junit.Test;

import static org.junit.Assert.*;


class BlueTest {
    @Test
    public void testShowColorBlue() {
        Blue blue = new Blue();
        assertEquals("Blue", blue.name);
    }
}