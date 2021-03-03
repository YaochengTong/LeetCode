
// @Title: 组合总和 (Combination Sum)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-01 09:08:53
// @Runtime: 3 ms
// @Memory: 38.6 MB

class Solution {

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    ArrayList<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(0, candidates, target);
        return result;
    }

    private void backTrack(int i, int[] candidates, int target) {
        if (target < 0) { return; }
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            temp.add(candidates[j]);
            backTrack(j, candidates, target - candidates[j]);
            temp.remove(temp.size() - 1);
        }
    }

}

