
// @Title: 组合总和 II (Combination Sum II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-01 09:14:49
// @Runtime: 4 ms
// @Memory: 38.5 MB

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if (j > i && candidates[j] == candidates[j - 1]) { continue; }
            temp.add(candidates[j]);
            backTrack(j + 1, candidates, target - candidates[j]);
            temp.remove(temp.size() - 1);
        }
    }

}
