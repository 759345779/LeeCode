package majinxin;


public class Mail {
    public static void main(String[] args) {
        System.out.println("hello world");
        try {
            test02();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //find fist not repeated char
    public static void test01() {
        String arry = "dsjkhaokjadsuiuuuufjuids";
        int index = TestUtils.getFirstChar(arry);
        if (index >= 0) {
            System.out.println("char is "+arry.charAt(index)+" ,index is "+index+".");
        }
    }

    public static void test02() throws Exception {
        MyStack stack = new MyStack();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push("Tom");
        stack.push("jim");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push("kstar");
    }


}
