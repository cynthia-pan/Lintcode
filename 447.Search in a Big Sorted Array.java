public class Solution {
    /*
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return: An integer which is the first index of target.
     */
     /*
     Given a big sorted array with positive integers sorted by ascending order. 
     The array is so big so that you can not get the length of the whole array directly, and you can only access the kth number by ArrayReader.get(k) (or ArrayReader->get(k) for C++). Find the first index of a target number. Your algorithm should be in O(log k), where k is the first index of the target number.
     Return -1, if the number doesn't exist in the array.
    */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        int index = 0;
        while (reader.get(index) != -1 && reader.get(index) < target ) {
            index = index * 2 + 1;
        }
        int start = 0, end = index;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (reader.get(mid) == target) {
                end = mid;
            } else if (reader.get(mid) > target || reader.get(mid) == -1) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        if (reader.get(start) == target)
            return start;
        if (reader.get(end) == target)
            return end;
        
        return -1;
    }
}
