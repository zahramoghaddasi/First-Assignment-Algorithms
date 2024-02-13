import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercises2Test {
    static Exercises2 handle;

    @BeforeAll
    static void setUp() {
        handle = new Exercises2();
    }

    @Test
    void twoSumTest1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, handle.twoSum(nums, target));
    }

    @Test
    void twoSumTest2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, handle.twoSum(nums, target));
    }

    @Test
    void twoSumTest3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, handle.twoSum(nums, target));
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

    @Test
    void permuteTest1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 2, 3));
        expected.add(List.of(2, 3, 1));
        expected.add(List.of(1, 3, 2));
        expected.add(List.of(3, 2, 1));
        expected.add(List.of(3, 1, 2));
        expected.add(List.of(2, 1, 3));
        List<List<Integer>> result = handle.permute(nums);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void permuteTest2() {
        int[] nums = {1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 2));
        expected.add(List.of(2, 1));
        List<List<Integer>> result = handle.permute(nums);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void permuteTest3() {
        int[] nums = {1};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        List<List<Integer>> result = handle.permute(nums);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

}