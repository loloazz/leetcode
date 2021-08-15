package _2判断一个链表是否有环;

/**
 * @Author: Yaolong
 * @Date: 2021/8/6 20:28
 * @Pagename: _2判断一个链表是否有环
 * @ProjectName: leetcode
 * @Describe:
 **/
public class Node {
    public  int data ;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
