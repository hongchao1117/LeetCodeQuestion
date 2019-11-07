package Stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        String[] ops = new String[]{"5","2","C","D","+"};
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String curElem = ops[i];
            char c = curElem.charAt(0);

            if (c == '+'){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                count += first + second;
                st.push(first+second);
            }else if (c == 'D'){
                count += st.peek()*2;
                st.push(2*st.peek());
            }else if (c == 'C'){
                count -= st.pop();
            }else{

                count += Integer.parseInt(curElem);
                st.push(Integer.parseInt(curElem));
            }

        }
        System.out.println(count);
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < ops.length; i++) {
//            String curElem = ops[i];
//            char c = curElem.charAt(0);//将字符串转换为字符
//
//            if (c == '+'){
//                int first = st.pop();
//                int second = st.peek();
//                st.push(first);
//                count += first+second;
//                st.push(first+second);
//            }else if (c=='D'){
//                count += 2*st.peek();
//                st.push(2*st.peek());
//            }else if (c == 'C'){
//                count -= st.pop();
//
//            }else{
//                int ele = Integer.parseInt(curElem);
//                count += ele;
//                st.push(ele);
//            }
//        }
//        System.out.println(count);
    }
}
