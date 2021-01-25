
// @Title: 两个数组的交集 II (Intersection of Two Arrays II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-15 04:16:43
// @Runtime: 3 ms
// @Memory: 38.6 MB

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length < nums2.length) { return intersect(nums2, nums1); }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[nums1.length];

        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                int count = map.get(n);
                map.put(n, ++count);
            }
        }

        int index = 0;
        for (int k : nums2) {
            if (map.containsKey(k) && map.get(k) > 0) {
                result[index++] = k;
                int count = map.get(k);
                map.put(k, --count);
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
