public class Solution {
    /*
    There is an integer array which has the following features:
    The numbers in adjacent positions are different.
    A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
    We define a position P is a peak if:
    A[P] > A[P-1] && A[P] > A[P+1]
    Find a peak element in this array. Return the index of the peak.
     Notice
    It's guaranteed the array has at least one peak.
    The array may contain multiple peeks, find any of them.
    The array has at least 3 numbers in it.
    */
    /*
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        if (A.length == 0)
            return -1;
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid + 1])
                end = mid;
            else
                start = mid;
        }
        if (A[start] > A[end])
            return start;
        return end;
    }
}
