package com.qdw.zhongxing;

import com.qdw.TreeNode;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @PackageName:com.qdw.zhongxing
 * @ClassName: Test22
 * @Description:
 * @date: 2020/9/10 0010 10:25
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        queue.add(root);
        int i = 1;
        while (i<n) {
            int size = queue.size();
            while(size>0){
                size--;
                TreeNode poll = queue.poll();
                if(i<n){
                    TreeNode treeNode = new TreeNode(arr[i++]);
                    queue.add(treeNode);
                    poll.left = treeNode;
                }
                if(i<n){
                    TreeNode treeNode = new TreeNode(arr[i++]);
                    queue.add(treeNode);
                    poll.right = treeNode;
                }
            }
        }

        int op = 0;
        int x = 0;
        while (sc.hasNextInt()){
            op = sc.nextInt();
            x = sc.nextInt();
            m1(op,root);
            m2(x,root);
        }
    }
    public static boolean m1(int op,TreeNode root){
        if(root==null){
            return false;
        }
        if(root.val==op){
            if (root.left==null){
                return true;
            }else if(root.right==null){
                if (root.val<root.left.val){
                    int temp = root.val;
                    root.val = root.left.val;
                    root.left.val = temp;
                }
                return true;
            }
            int left = root.left.val;
            int right = root.right.val;
            int[] arr = new int[3];
            arr[0] = root.val;
            arr[1] = left;
            arr[2] = right;
            Arrays.sort(arr);
            root.val = arr[2];
            root.left.val = arr[1];
            root.right.val = arr[0];
            return true;
        }else {
            if (m1(op,root.left)){
                return true;
            }
            if (m1(op,root.right)){
                return true;
            }
        }
        return false;
    }
    public static void m2(int x,TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < x; i++) {
            int size = queue.size();
            while(size>0){
                size--;
                TreeNode poll = queue.poll();
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }

        }
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        System.out.println();
    }
}
