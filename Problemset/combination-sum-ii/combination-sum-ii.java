
// @Title: 组合总和 II (Combination Sum II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-27 09:57:01
// @Runtime: 3 ms
// @Memory: 38.9 MB

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates, target, 0);
        return result;
    }

    private void backTrack(int[] candidates, int target, int i) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (candidates[j] <= target) {
                if (j > i && candidates[j] == candidates[j - 1]) { continue; }
                temp.add(candidates[j]);
                backTrack(candidates, target - candidates[j], j + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

}

