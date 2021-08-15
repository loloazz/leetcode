package _1用两个栈实现队列;

import java.util.Stack;

/**
 * @Author: Yaolong
 * @Date: 2021/8/6 16:26
 * @Pagename: 用两个栈实现队列
 * @ProjectName: leetcode
 * @Describe:
 * 思路和算法
 *
 * 维护两个栈，第一个栈支持插入操作，第二个栈支持删除操作。
 *
 * 根据栈先进后出的特性，我们每次往第一个栈里插入元素后，第一个栈的底部元素是最后插入的元素，
 * 第一个栈的顶部元素是下一个待删除的元素。
 * 为了维护队列先进先出的特性，我们引入第二个栈，用第二个栈维护待删除的元素，
 * 在执行删除操作的时候我们首先看下第二个栈是否为空。
 * 如果为空，我们将第一个栈里的元素一个个弹出插入到第二个栈里，
 * 这样第二个栈里元素的顺序就是待删除的元素的顺序，
 * 要执行删除操作的时候我们直接弹出第二个栈的元素返回即可。
 *
 * 成员变量
 *
 * 维护两个栈 stackOut和 stackIn，其中 stackIn 支持插入操作，stackOut 支持删除操
 *
 **/
public class CQueue {
    private static Stack<Integer> stackIn;
    private static Stack<Integer> stackOUt;

    public CQueue() {
        stackIn = new Stack<>();
        stackOUt = new Stack<>();
    }

    public void appendTail(int value) {
        stackIn.add(value);
    }

    public int deleteHead() {

        if (stackOUt.empty()) {
            while (!stackIn.empty()) {
                stackOUt.push(stackIn.pop());
            }

        }

        if (stackOUt.empty()) {
            return -1;
        } else {
            int y = stackOUt.pop();
            System.out.println(y);
            return y;
        }
    }

    public void show() {

        System.out.println(stackIn.toString());
        System.out.println(stackOUt.toString());
    }

}
