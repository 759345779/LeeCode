package majinxin;

import java.util.Arrays;
import java.util.HashMap;

public class MethodSet {
    public static int[] run_01(int[] int_arrays, int target) {
        int[] result = new int[2];
        for (int i = 0; i < int_arrays.length; i++) {
            int first = int_arrays[i];
            if (first > target) {
                break;
            }
            int second = target - first;
            for (int y = i + 1; y < int_arrays.length; y++) {
                if (int_arrays[y] > second) {
                    break;
                }
                if (second == int_arrays[y]) {
                    result[0] = i;
                    result[1] = y;
                    break ;
                }
            }

            if (result[1] != 0) {
                break;
            }
        }
        return result;
    }

    public static int[] run_01_1(int[] int_arrays,int target) {
        HashMap cacheNum = new HashMap();
        for (int i = 0; i < int_arrays.length; i++) {
            int num1 = int_arrays[i];
            int num2 = target - num1;
            if (cacheNum.containsKey(num2)) {
                return new int[]{(int) cacheNum.get(num2), i};
            }else {
                cacheNum.put(num1, i);
            }
        }
        return new int[]{0, 0};

    }

    public static class ListNode<T>{
        T value;
        ListNode<T> nextNode;

        public ListNode(T value) {
            this(value, null);
        }

        public ListNode(T value, ListNode<T> nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        boolean hasNext() {
            return nextNode != null;
        }

        public ListNode<T> next() {
            return nextNode;
        }


    }
    public static ListNode<Integer> run_02(ListNode<Integer> input_01, ListNode<Integer> input_02) {
        ListNode<Integer> r_node = null;
        ListNode<Integer> returnNode = null;
        int tmp = 0;
        while (input_01 !=null || input_02 !=null) {
            if (input_01 !=null) {
                tmp = tmp + input_01.value;
                input_01 = input_01.nextNode;
            }
            if (input_02 !=null) {
                tmp = tmp + input_02.value;
                input_02 = input_02.nextNode;
            }

            ListNode node = null;
            if (tmp > 9) {
                node = new ListNode(tmp % 10);
                tmp = 1;
            }else {
                node = new ListNode(tmp);
                tmp = 0;
            }

            System.out.println("node=" + node.value);
            if (returnNode == null) {
                r_node = node;
                returnNode = r_node;
            }else {
                r_node.nextNode = node;
                r_node = node;
            }
        }
        return returnNode;
    }
    public static void run_02_printListNode(ListNode<Integer> input){
        StringBuilder builder = new StringBuilder("[");
        ListNode<Integer> tmp = input;
        while (tmp!=null) {
            builder.append(tmp.value);
            builder.append(", ");
            tmp = tmp.nextNode;
        }
        int lastIndex = builder.lastIndexOf(",");
        if (lastIndex >= 0) {
            builder.delete(lastIndex, builder.length());
        }
        builder.append("]");
        System.out.println(builder.toString());

    }
}
