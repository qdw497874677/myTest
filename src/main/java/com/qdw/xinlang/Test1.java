package com.qdw.xinlang;

import com.qdw.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.xinlang
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/13 0013 16:21
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(s[0]));
        int i = 1;
        queue.add(root);
        while (i<s.length){
            TreeNode left = new TreeNode(Integer.parseInt(s[i++]));
            TreeNode poll = queue.poll();
            poll.left = left;
            queue.add(left);
            if (i<s.length){
                TreeNode right = new TreeNode(Integer.parseInt(s[i++]));
                poll.right = right;
                queue.add(right);
            }
        }
        print(root);
    }
    public static TreeNode m(TreeNode root){
        if (root==null){
            return root;
        }
        if (root.left!=null && root.left.left==null){
            TreeNode newHead = root.left;
            newHead.left = root.right;
            newHead.right = root;
            return newHead;
        }
        TreeNode m = m(root.left);
        return m;
    }
    public static void print(TreeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);
    }
}
