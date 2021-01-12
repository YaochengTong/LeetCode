
// @Title: 子集 (Subsets)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-12 05:52:13
// @Runtime: 1 ms
// @Memory: 38.4 MB

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTrack(0,nums);
        return result;
    }

    private void backTrack(int i, int[] nums){
        result.add(new ArrayList<>(temp));
        for(int j = i; j<nums.length; j++){  
            temp.add(nums[j]);
            backTrack(j+1,nums);            
            temp.remove(temp.size()-1);
        }
    }



}
