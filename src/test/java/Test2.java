import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test2 {
    static Exercises2 handle;

    @BeforeAll
    static void setUp() {
        handle = new Exercises2();
    }

    @Test
    void romanToIntTest1() {
        assertEquals(3, handle.romanToInt("III"));
    }

    @Test
    void romanToIntTest2() {
        assertEquals(4, handle.romanToInt("IV"));
    }

    @Test
    void romanToIntTest3() {
        assertEquals(58, handle.romanToInt("LVIII"));
    }

    @Test
    void romanToIntTest4() {
        assertEquals(1994, handle.romanToInt("MCMXCIV"));
    }

    @Test
    void romanToIntTest5() {
        assertEquals(9, handle.romanToInt("IX"));
    }

}