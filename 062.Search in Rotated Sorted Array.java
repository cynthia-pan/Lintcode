public class Solution {
    /*
    Suppose a sorted array is rotated at some pivot unknown to you beforehand.
    (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

    You are given a target value to search. If found in the array return its index, otherwise return -1.
    You may assume no duplicate exists in the array.
    Example
    For [4, 5, 1, 2, 3] and target=1, return 2.
    For [4, 5, 1, 2, 3] and target=0, return -1.
    */
    /**
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
        if (A.length == 0)
            return -1;
        int start = 0, end = A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == target)
                return mid;
            if (A[mid] < A[end]) {
                if (target > A[mid] && target <= A[end])
                    start = mid + 1;
                else
                    end = mid;
            } else {
                if (A[start] <= target && A[mid] > target)
                    end = mid;
                else
                    start = mid + 1;
            }
        }
            
        return -1;
    }
}
