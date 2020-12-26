package de.sanj0.ape;

import static org.junit.jupiter.api.Assertions.*;

class ApeVec2dTest {

    @org.junit.jupiter.api.Test
    void add() {
        final ApeVec2d v1 = new ApeVec2d(3.14, 9.81);
        final ApeVec2d v2 = new ApeVec2d(2.71, 9871625);
        final ApeVec2d result = v1.add(v2);

        assertEquals(v1.getX() + v2.getX(), result.getX());
        assertEquals(v1.getY() + v2.getY(), result.getY());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        final ApeVec2d v1 = new ApeVec2d(3.14, 9.81);
        final ApeVec2d v2 = new ApeVec2d(2.71, -1092);
        final ApeVec2d result = v1.subtract(v2);

        assertEquals(v1.getX() - v2.getX(), result.getX());
        assertEquals(v1.getY() - v2.getY(), result.getY());
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        final ApeVec2d v1 = new ApeVec2d(3.14, 9.81);
        final ApeVec2d v2 = new ApeVec2d(2.71, .316);
        final ApeVec2d result = v1.multiply(v2);

        assertEquals(v1.getX() * v2.getX(), result.getX());
        assertEquals(v1.getY() * v2.getY(), result.getY());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        final ApeVec2d v1 = new ApeVec2d(3.14, 9.81);
        final ApeVec2d v2 = new ApeVec2d(2.71, -.39);
        final ApeVec2d result = v1.divide(v2);

        assertEquals(v1.getX() / v2.getX(), result.getX());
        assertEquals(v1.getY() / v2.getY(), result.getY());
    }

    @org.junit.jupiter.api.Test
    void unit() {
        assertEquals(new ApeVec2d(1, 0), new ApeVec2d(1, 0).unit());
        assertEquals(new ApeVec2d(0, 1), new ApeVec2d(0, 1).unit());
        final double v = 314;
        final double expected = v / Math.sqrt(v * v * 2);
        assertEquals(new ApeVec2d(expected, expected), new ApeVec2d(314, 314).unit());
    }

    @org.junit.jupiter.api.Test
    void withMag() {
        assertEquals(new ApeVec2d(0, 999).getY(), new ApeVec2d(0, 119264).withMag(999).getY(), 0.00001);
        assertEquals(314, new ApeVec2d(-1234, 0).withMag(314).mag());
    }

    @org.junit.jupiter.api.Test
    void magSquared() {
        assertEquals(1, new ApeVec2d(1, 0).magSquared());
        assertEquals(1, new ApeVec2d(0, 1).magSquared());
        assertEquals(2, new ApeVec2d(1, 1).magSquared());
        assertEquals(8, new ApeVec2d(2, 2).magSquared());
    }

    @org.junit.jupiter.api.Test
    void mag() {
        assertEquals(1, new ApeVec2d(1, 0).mag());
        assertEquals(1, new ApeVec2d(0, 1).mag());
        assertEquals(Math.sqrt(8), new ApeVec2d(2, 2).mag());
    }
}