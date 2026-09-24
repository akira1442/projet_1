package test;

import phys.*;

@interface Test {
}

class PositionTest {

    private static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }

    private static void assertEquals(Object expected, Object actual) {
        if (expected == null ? actual != null : !expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }

    private static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Condition was false");
        }
    }

    @Test
    void testConstructeurAvecParametres() {
        Position p = new Position(3, 5, 7);
        assertEquals(3, p.getX());
        assertEquals(5, p.getY());
        assertEquals(7, p.getZ());
    }

    @Test
    void testConstructeurParDefaut() {
        Position p = new Position();
        assertTrue(p.getX() >= 0 && p.getX() < 50);
        assertTrue(p.getY() >= 0 && p.getY() < 50);
        assertTrue(p.getZ() >= 0 && p.getZ() < 50);
    }

    @Test
    void testOrigine() {
        Position p = Position.Origine();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
        assertEquals(0, p.getZ());
    }

    @Test
    void testGetX() {
        Position p = new Position(1, 2, 3);
        assertEquals(1, p.getX());
    }

    @Test
    void testGetY() {
        Position p = new Position(1, 2, 3);
        assertEquals(2, p.getY());
    }

    @Test
    void testGetZ() {
        Position p = new Position(1, 2, 3);
        assertEquals(3, p.getZ());
    }

    @Test
    void testNewPosAvecPosition() {
        Position p1 = new Position(1, 2, 3);
        Position p2 = new Position(10, 20, 30);

        p1.newPos(p2);

        assertEquals(10, p1.getX());
        assertEquals(20, p1.getY());
        assertEquals(30, p1.getZ());
    }

    @Test
    void testNewPosAvecCoordonnees() {
        Position p = new Position(1, 2, 3);

        p.newPos(100, 200, 300);

        assertEquals(100, p.getX());
        assertEquals(200, p.getY());
        assertEquals(300, p.getZ());
    }

    @Test
    void testToString() {
        Position p = new Position(1, 2, 3);
        assertEquals("(1, 2, 3)", p.toString());
    }
}