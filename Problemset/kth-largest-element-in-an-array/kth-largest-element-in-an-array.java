
// @Title: 数组中的第K个最大元素 (Kth Largest Element in an Array)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-24 20:33:37
// @Runtime: 2 ms
// @Memory: 38.8 MB

class Solution {

    Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private int quickSelect(int[] nums, int low, int high, int k) {
        int p = randomlizedPartition(nums, low, high);
        if (p == nums.length - k) {
            return nums[p];
        } else if (p < nums.length - k) {
            return quickSelect(nums, p + 1, high, k);
        } else {
            return quickSelect(nums, low, p - 1, k);
        }
    }

    private int randomlizedPartition(int[] nums, int low, int high) {
        int r = random.nextInt(high - low + 1) + low;
        swap(nums, r, high);
        return partition(nums, low, high);
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
