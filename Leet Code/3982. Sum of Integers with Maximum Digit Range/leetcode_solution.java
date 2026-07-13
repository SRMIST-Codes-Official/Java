class Solution {
    public int maxDigitRange(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mdr = -1;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int max = -1;
            int min = 10;
            while (temp > 0) {
                int d = temp % 10;
                max = Math.max(max, d);
                min = Math.min(min, d);
                temp = temp / 10;
            }
            mdr = Math.max(mdr, max - min);
        }
        int s=0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int max = -1;
            int min = 10;
            while (temp > 0) {
                int d = temp % 10;
                max = Math.max(max, d);
                min = Math.min(min, d);
                temp = temp / 10;
            }
            if(max-min==mdr){
                s+=nums[i];
            }
        }

        return s;
    }
}