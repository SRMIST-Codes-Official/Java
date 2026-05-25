class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int c=0;
        int cn=nums[0];
        int cnc=0;
        for(int i=0;i<nums.length;i++){
            if(cn!=nums[i]){
                cn=nums[i];
                cnc=0;
            }
            cnc++;
            if(cnc>k){
                nums[i]=-1;
            }else{
                c++;
            }
        }
        int[] arr=new int[c];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                arr[j++]=nums[i];
            }
        }
        return arr;
    }
}