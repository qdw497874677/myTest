package com.qdw.xinlangjinrong;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @PackageName:com.qdw.xinlangjinrong
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/28 0028 20:25
 */

class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;
}
class Commad{
    String commad;
    TreeNode node;
    public Commad(String s,TreeNode node){
        commad = s;
        this.node = node;
    }
}
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE<Long.MAX_VALUE);
    }
    public ArrayList<Integer> postOrderFast (TreeNode root) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Commad> stack = new LinkedList<>();
        stack.addLast(new Commad("go",root));
        while (!stack.isEmpty()){
            Commad commad = stack.pollFirst();
            if ("go".equals(commad.commad)){
                stack.addFirst(new Commad("print",commad.node));
                if (commad.node.right!=null){
                    stack.addFirst(new Commad("go",commad.node.right));
                }
                if (commad.node.left!=null){
                    stack.addFirst(new Commad("go",commad.node.left));
                }

            }else {
                res.add(commad.node.val);
            }
        }
        return res;
    }

}
