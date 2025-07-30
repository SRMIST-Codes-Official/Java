class Solution {
    public int[] separateDigits(int[] nums) {
        List<Character> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                l.add(s.charAt(j));
            }
        }
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i)-'1'+1;
        }
        return arr;
    }
}