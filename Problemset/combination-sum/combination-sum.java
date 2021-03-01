
// @Title: 组合总和 (Combination Sum)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-27 09:34:49
// @Runtime: 2 ms
// @Memory: 38.8 MB

class Solution {

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    ArrayList<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(0, candidates, target);
        return result;
    }

    private void backTrack(int i, int[] candidates, int target) {
        if (i == candidates.length) { return; }
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        backTrack(i + 1, candidates, target);
        if (target - candidates[i] >= 0) {
            temp.add(candidates[i]);
            backTrack(i, candidates, target - candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }

}
