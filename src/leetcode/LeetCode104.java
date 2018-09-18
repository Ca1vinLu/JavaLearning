package leetcode;

import java.util.Iterator;
import java.util.LinkedList;

public class LeetCode104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 0;
        LinkedList<TreeNode> list = new LinkedList<>();
        LinkedList<TreeNode> tempList = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            depth++;
            tempList.clear();
            tempList.addAll(list);
            list.clear();
            Iterator<TreeNode> iterator = tempList.iterator();
            while (iterator.hasNext()) {
                TreeNode next = iterator.next();
                if (next.left != null) {
                    list.add(next.left);
                }
                if (next.right != null) {
                    list.add(next.right);
                }
                iterator.remove();
            }
        }

        return depth;
    }


}
