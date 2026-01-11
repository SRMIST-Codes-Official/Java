class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr1=new int[101];
        int[] arr2=new int[101];
        int[] arr3=new int[101];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            arr1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            arr2[nums2[i]]++;
        }
        for(int i=0;i<nums3.length;i++){
            arr3[nums3[i]]++;
        }
        for(int i=0;i<101;i++){
            if((arr1[i]!=0 && arr2[i]!=0) || (arr1[i]!=0 && arr3[i]!=0) || (arr2[i]!=0 && arr3[i]!=0)){
                l.add(i);
            }
        }
        return l;
    }
}