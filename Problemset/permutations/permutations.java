
// @Title: 全排列 (Permutations)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-03 08:17:41
// @Runtime: 2 ms
// @Memory: 38.5 MB

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (temp.size() == nums.length) { result.add(new ArrayList<>(temp)); }
        for (int num : nums) {
            if (!temp.contains(num)) {
                temp.add(num);
                permute(nums);
                temp.remove(temp.size() - 1);
            }
        }
        return result;
    }

}

