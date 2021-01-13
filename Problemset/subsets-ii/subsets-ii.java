
// @Title: 子集 II (Subsets II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-13 04:52:24
// @Runtime: 1 ms
// @Memory: 38.8 MB

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            int currentSize = result.size();
            for (int j = 0; j < currentSize; j++) {
                if (i > 0 && nums[i] == nums[i - 1] && j < p ) { continue; }
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
            p = currentSize;
        }
        return result;
    }

}
