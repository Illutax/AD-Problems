package tech.dobler.adproblems;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class Übung1_test extends TestCase {

    private Übung1 ü1 = new Übung1();

    @Test
    public void gcdTest() {
        assertEquals(3, ü1.gcd(6,15));
        assertEquals(3, ü1.gcd(15,6));
        assertEquals(2, ü1.gcd(6,16));
        assertEquals(2, ü1.gcd(16,6));
        assertEquals(1, ü1.gcd(1,1));
        assertEquals(1, ü1.gcd(0,1));
    }

    @Test
    public void lcmTest() {
        assertEquals(30, ü1.lcm(6,15));
        assertEquals(30, ü1.lcm(15,6));
        assertEquals(1, ü1.lcm(1,1));
        assertEquals(2520, ü1.lcm(140,72));
        assertEquals(2520, ü1.lcm(72,140));
        assertEquals(36001, ü1.lcm(37,973));
        assertEquals(36001, ü1.lcm(973,37));
        assertEquals(602430, ü1.lcm(2335,258));
        assertEquals(602430, ü1.lcm(258,2335));
        assertEquals(211079687, ü1.lcm(13663,15449));
        assertEquals(211079687, ü1.lcm(15449,13663));
    }
}
