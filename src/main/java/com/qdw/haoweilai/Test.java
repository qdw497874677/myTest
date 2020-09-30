package com.qdw.haoweilai;

import com.qdw.TreeNode;

import java.util.*;

/**
 * @PackageName:com.qdw.haoweilai
 * @ClassName: Test
 * @Description:
 * @date: 2020/9/20 0020 13:30
 */
public class Test {

    public String notReCuPreOrder (TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root==null){
            return "";
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.addLast(root);
        while (!stack.isEmpty()){
            TreeNode treeNode = stack.pollLast();
            res.add(treeNode.val+"");
            if (treeNode.right!=null){
                stack.addLast(treeNode.right);
            }
            if (treeNode.left!=null){
                stack.addLast(treeNode.left);
            }
        }
        return String.join(",",res);
    }
}
