package majinxin;


import org.junit.Test;

import java.util.Arrays;

import static majinxin.MethodSet.run_02;
import static majinxin.MethodSet.run_02_printListNode;

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

    /**
     * 2. Add Two Numbers
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Example:
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */

    @Test
    public void test_leeCode_02() {
        MethodSet.ListNode node_01 = new MethodSet.ListNode<>(3, null);
        MethodSet.ListNode node_02 = new MethodSet.ListNode<>(4, node_01);
        MethodSet.ListNode<Integer> input_01 = new MethodSet.ListNode<>(2, node_02);

        MethodSet.ListNode n_01 = new MethodSet.ListNode<>(4);
        MethodSet.ListNode n_02 = new MethodSet.ListNode<>(6,n_01);
        MethodSet.ListNode<Integer> input_02 = new MethodSet.ListNode<>(5, n_02);

        run_02_printListNode(input_01);
        run_02_printListNode(input_02);
        MethodSet.ListNode outputListNode = run_02(input_01, input_02);
        run_02_printListNode(outputListNode);

    }

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * Example 1:
     *
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     *
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     *
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    @Test
    public void test_leeCode_03() {

    }
}
