package test;

import org.junit.jupiter.api.Test;
import testingLab.MiddleEarthBattle;

import static org.junit.jupiter.api.Assertions.*;

class MiddleEarthBattleTest {

    @Test
    void goodWins() {
        String result = MiddleEarthBattle.calculateResult(10, 5);
        assertEquals("The light prevails in Middle-Earth, good wins!", result);
    }

    @Test
    void evilWins() {
        String result = MiddleEarthBattle.calculateResult(4, 8);
        assertEquals("The light has fallen to darkness, evil wins!", result);
    }

    @Test
    void tie() {
        String result = MiddleEarthBattle.calculateResult(7, 7);
        assertTrue(result.contains("tie"));
    }

    @Test
    void hobbitLosesAgainstOrc() {
        String result = MiddleEarthBattle.calculateResult(1, 2);
        assertFalse(result.contains("good wins"));
    }

    @Test
    void threeHobbitsBeatOneOrc() {
        String result = MiddleEarthBattle.calculateResult(3, 2);
        assertEquals("The light prevails in Middle-Earth, good wins!", result);
    }

    @Test
    void goodStrengthNotEqualEvil() {
        String result = MiddleEarthBattle.calculateResult(5, 2);
        assertNotEquals("The light has fallen to darkness, evil wins!", result);
    }

    @Test
    void testAssertThrowsSimple() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Simple demonstration");
        });
    }
}