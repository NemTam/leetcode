package first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static first.TwoSum.twoSum;

public class TestTwoSum {

    @Test
    public void testTwoSum1(){
        int[] ints = {1, 2, 3, 4, 5};
        int[] res = twoSum(ints, 5);
        assert Arrays.equals(res, new int[]{1, 2});
    }

    @Test
    public void testTwoSum2(){
        int[] ints = {3,3};
        int[] res = twoSum(ints, 6);
        assert Arrays.equals(res, new int[]{0, 1});
    }
}
