
// @Title: 排列序列 (Permutation Sequence)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-28 00:52:58
// @Runtime: 1 ms
// @Memory: 35.7 MB

class Solution {

    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            nums.add(i);
        }

        k--;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int partSize = fact / (n - i);
            int idx = k / partSize;
            res.append(nums.get(idx));
            nums.remove(idx);
            k %= partSize;
            fact /= (n - i);
        }
        return res.toString();
    }
    
}
