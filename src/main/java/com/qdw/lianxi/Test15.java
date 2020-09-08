package com.qdw.lianxi;


/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test15
 * @Description:
 * @date: 2020/8/31 0031 22:09
 */
public class Test15 {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.setNext(new Node(2)).setNext(new Node(3)).setNext(new Node(4)).setNext(new Node(7)).setNext(new Node(9));
        Node reverse = reverse(node);
        while(reverse!=null){
            System.out.println(reverse.val);
            reverse = reverse.next;
        }
    }
    static Node tail;
    public static Node reverse(Node head){
        if(head==null || head.next==null){
            tail = head;
            return head;
        }
        Node newHead = reverse(head.next);
        tail.next = head;
        tail = head;
        head.next = null;
        return newHead;
    }
}
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
    public Node setNext(Node next){
        this.next = next;
        return next;
    }
}
