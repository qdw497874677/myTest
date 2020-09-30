package com.qdw;

import javafx.scene.layout.Priority;

/**
 * @PackageName:com.qdw
 * @ClassName: TreeNode
 * @Description:
 * @date: 2020/8/8 0008 13:26
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }

    @Override
    public String toString(){
        String s = " "+val+" ";
        System.out.println(s);
        return s;
    }
}
