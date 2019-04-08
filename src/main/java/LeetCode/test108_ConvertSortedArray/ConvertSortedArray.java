package LeetCode.test108_ConvertSortedArray;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

public class ConvertSortedArray {
    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0, right = nums.length - 1;

        return helper(nums, left, right);
    }

    private TreeNode helper(int[] nums, int left, int right){
        if(left > right)
            return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);

        return node;
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        new ConvertSortedArray().sortedArrayToBST(nums);
    }
}
