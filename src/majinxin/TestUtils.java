package majinxin;

public class TestUtils {

    //get first not equals char in the String.
    public static int getFirstChar(String string) {
        int result= string.length();
        for (char c = 'a'; c >= 'a' && c <= 'z'; c++) {
            int start = string.indexOf(c);
            int end = string.lastIndexOf(c);
            if (start == end && start != -1) {
                result = Math.min(result, start);
            }
        }
        if (result == string.length()) {
            return -1;
        }
        return result;

    }


}

