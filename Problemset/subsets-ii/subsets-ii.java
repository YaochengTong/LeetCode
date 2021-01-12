
// @Title: 子集 II (Subsets II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-12 06:05:56
// @Runtime: 1 ms
// @Memory: 38.5 MB

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(0,nums);
        return result;
    }

    private void backTrack(int i, int[] nums) {
        result.add(new ArrayList<>(temp));
        for (int j = i; j < nums.length; j++) {
            if(j>i && nums[j] == nums[j-1]){ continue; }
            temp.add(nums[j]);
            backTrack(j + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
