
// @Title: 对角线遍历 II (Diagonal Traverse II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-08 02:28:17
// @Runtime: 38 ms
// @Memory: 65.1 MB

class Solution {
    
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int length = 0;
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            length += nums.get(i).size();
            for (int j = 0; j < nums.get(i).size(); j++) {
                if (map.containsKey(i + j)) {
                    map.get(i + j).add(nums.get(i).get(j));
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums.get(i).get(j));
                    map.put(i + j, list);
                }
            }
        }
        int[] res = new int[length];
        int index = 0;
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (int j = list.size() - 1; j >= 0; j--) {
                res[index] = list.get(j);
                index++;
            }
        }
        return res;
    }
}
