import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test1 {
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
}