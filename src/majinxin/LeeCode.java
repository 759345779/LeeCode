package majinxin;


import org.junit.Test;

import java.util.Arrays;

public class LeeCode {
    /**难度: Easy
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    @Test
    public void test_leeCode_01() {
        int[] int_arrays = new int[]{2, 7, 11, 15};
        for (int i = 2; i < 28; i++) {
            int[] result = MethodSet.run_01(int_arrays, i);
            if (result[1]!= 0) {
                Log.println(Arrays.toString(result) + " = " + i);
            }
            int[] result2 = MethodSet.run_01_1(int_arrays, i);
            if (result[1]!= 0) {
                Log.println(Arrays.toString(result2) + " = " + i);
            }

        }


    }
}
