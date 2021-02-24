package Stack;

import java.util.Stack;

/**
 * 栈排序。 编写程序，对栈进行排序使最小元素位于栈顶。最多只能使用一个其他的临时栈存放数据，
 * 但不得将元素复制到别的数据结构（如数组）中。该栈支持如下操作：push、pop、peek 和 isEmpty。
 * 当栈为空时，peek 返回 -1。
 *
 * 示例1:
 *
 *  输入：
 * ["SortedStack", "push", "push", "peek", "pop", "peek"]
 * [[], [1], [2], [], [], []]
 *  输出：
 * [null,null,null,1,null,2]
 * 示例2:
 *
 *  输入：
 * ["SortedStack", "pop", "pop", "push", "pop", "isEmpty"]
 * [[], [], [], [1], [], []]
 *  输出：
 * [null,null,null,null,null,true]
 */
public class SortedStack {
    Stack<Integer> stack;
    Stack<Integer> tempStack;

    public SortedStack() {
        stack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void push(int val) {
        while (!stack.isEmpty() && stack.peek()<val){
            tempStack.push(stack.pop());
        }
        stack.push(val);
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        stack.pop();
    }

    public int peek() {
        if (stack.isEmpty()){
            return -1;
        }else{
            return stack.peek();
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
