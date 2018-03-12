public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
     /*
     Suppose a sorted array is rotated at some pivot unknown to you beforehand.
     (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
     Find the minimum element.
     Notice
     You may assume no duplicate exists in the array.
     */
    public int findMin(int[] nums) {
        if (nums.length == 0)
            return -1;
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            
            if (nums[start] > nums[mid])
                end = mid;
            else if (nums[mid] > nums[end])
                start = mid + 1;
            else 
                break;
        }
        
        if (nums[start] < nums[end])
            return nums[start];
        return nums[end];
    }
}
