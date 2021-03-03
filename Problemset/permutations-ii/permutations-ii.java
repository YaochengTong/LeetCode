
// @Title: 全排列 II (Permutations II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-03 09:05:05
// @Runtime: 1 ms
// @Memory: 39.3 MB

class Solution {

    public boolean[] visited;
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        visited = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums);
        return result;
    }

    public void backtrack(int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }
            temp.add(nums[i]);
            visited[i] = true;
            backtrack(nums);
            visited[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

}

