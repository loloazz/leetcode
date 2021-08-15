package _2判断一个链表是否有环;

/**
 * @Author: Yaolong
 * @Date: 2021/8/6 20:26
 * @Pagename: _2判断一个链表是否有环
 * @ProjectName: leetcode
 * @Describe: 判断两个单链表是否有环，有环返回第一个交叉的位置，无环返回null   ,只要一个链表有环，那么快慢指针会一定相遇
 **/
public class loopLink {


    public static Node isLoop(Node head) {
        if (head == null || head.next == null || head.next.next == null) { // 先判断链表是否为空
            return null;
        }
        // TODO: 2021/8/6 定义一个慢指针
        Node snode = head;

        // TODO: 2021/8/6 定义一个快指针

        Node fnode = head;

        while (snode != fnode) {

            if (fnode.next.next == null || snode.next == null) { // 如果快指针的指向空时那么就一定是无环的
                return null;
            }
            fnode = fnode.next.next;
            snode = snode.next;
        }

        // 当执行到这的时候，这就代表了，他在前面没有返回，就代表有环了

        // 将快指针置为head让他重新再来，速度设置为1
        fnode = head;
        while (fnode != snode) {
            fnode = fnode.next;

            snode = snode.next;
        }
        return snode;
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);
        Node node7 = new Node(70);
        Node node8 = new Node(80);
        Node node9 = new Node(90);

        node1.setNext(node2);

        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node9);
        node9.setNext(node5);


        Node loop = isLoop(node1);

        System.out.println(loop);
    }

}
