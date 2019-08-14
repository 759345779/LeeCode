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
}
