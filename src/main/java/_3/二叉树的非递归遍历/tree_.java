package _3.二叉树的非递归遍历;

import java.util.Stack;

/**
 * @Author: Yaolong
 * @Date: 2021/8/15 19:24
 * @Pagename: _3.二叉树的非递归遍历
 * @ProjectName: leetcode
 * @Describe:
 **/
public class tree_ {
    public static void preOrder(node head) {
        /**
         * 先序  ：
         *  0. 把头结点压栈再说
         *  1. 先从栈中弹出一个节点 cur
         *  2. 打印（或者处理）
         *  3.先把cur又孩子压栈，再把左孩子压栈(没有什么也不要做)
         *  4.重复 1 ,2 ,3 操作!!
         * */
        // 1. 先把头节点压栈
        if (head != null) {
            Stack<node> nodeStack = new Stack<>();
            // TODO: 2021/8/15 将头节点压栈
            nodeStack.push(head);

            // TODO: 2021/8/15 判断栈是否为空
            while (!nodeStack.isEmpty()) {
                // TODO: 2021/8/15 将头节点出栈
                head = nodeStack.pop();
                System.out.println(head);
                if (head.right != null) {
                    // 头节点的右孩子入栈
                    nodeStack.push(head.right);
                }
                if (head.left != null) {
                    // TODO: 2021/8/15 将头节点的左孩子入栈
                    nodeStack.push(head.left);
                }


            }
            System.out.println();


        }

    }


    public static void posOrder(node head) {
        /*
         * 后序遍历：
         * 需要两个栈   一个s1 一个s2
         * 0.将头节点压栈到s1
         * 1.将s1中的节点cur出栈2
         * 2.出栈的cur节点压栈到s2中
         * 3.先压左节点，再压右节点
         * 4.重复 1 2 3 直到s1栈中没有元素为止
         * 5.将s2中的节点顺序出栈
         *
         * */

        if (head != null) {
            // TODO: 2021/8/15 需要两个栈   一个s1 一个s2
            Stack<node> s1 = new Stack<>();
            Stack<node> s2 = new Stack<>();
            // TODO: 2021/8/15    0.将头节点压栈到s1
            s1.push(head);
            while (!s1.isEmpty()) {
                // TODO: 2021/8/15 1.将s1中的节点cur出栈2
                head = s1.pop();
                // TODO: 2021/8/15 2.出栈的cur节点压栈到s2中
                s2.push(head);

                // TODO: 2021/8/15 3. 先压左节点，再压右节点
                if (head.left != null) {
                    s1.push(head.left);
                }
                if (head.right != null) {
                    s1.push(head.right);
                }
            }

            // 上面的完成后，对s2依次出栈
            while (!s2.isEmpty()){
                System.out.println(s2.pop().data);
            }


        }

    }

    public static void middleOrder(node head) {
        /*   这里没有右树的概念   右 -》 左头右   右在循环
        * 中序：
        * 1.先把每颗子树，整个左边界进栈，依次弹出的过程中打印，对弹出节点的右树 接着执行以上操作
        *
        * */

        if (head!=null){
            Stack<node> s1 = new Stack<>();
            while (!s1.isEmpty()||head !=null){
                if (head!=null){
                    s1.push(head);
                    head = head.left;
                }else {
                    head = s1.pop();
                    System.out.println(head.data);
                     head = head.right;
                }

            }
        }

    }



}
