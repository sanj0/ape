package de.sanj0.ape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    private final static Box ex = new Box(new ApeVec2d(3, 1), 2, 2);

    @Test
    void testExampleBox() {
        assertEquals(new ApeVec2d(1, 3), ex.getMax());
    }
    @Test
    void width() {
        assertEquals(2, ex.width());
    }

    @Test
    void height() {
        assertEquals(2, ex.height());
    }

    @Test
    void area() {
        assertEquals(4, ex.area());
    }
}