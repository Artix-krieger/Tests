public static void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int curr = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[curr] == 0) {
                if (nums[i] == 0) continue;
                int temp = nums[curr];
                nums[curr] = nums[i];
                nums[i] = temp;
            }
            curr++;
        }
    }
