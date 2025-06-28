class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>list=new ArrayList<>();
        int max=0;
        for(int m:candies){
            if(m>max)
            max=m;
        }
        for(int i:candies){
        if(max<=(i+extraCandies)){
            list.add(true);
        }
        else
        list.add(false);
    }
        return list;
    }
}