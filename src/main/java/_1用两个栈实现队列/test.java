package _1用两个栈实现队列;

/**
 * @Author: Yaolong
 * @Date: 2021/8/6 16:44
 * @Pagename: 用两个栈实现队列
 * @ProjectName: leetcode
 * @Describe:
 **/
public class test {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(20);
        cQueue.appendTail(50);
        cQueue.appendTail(50);
        cQueue.appendTail(50);
        cQueue.appendTail(50);
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.show();
    }
}
