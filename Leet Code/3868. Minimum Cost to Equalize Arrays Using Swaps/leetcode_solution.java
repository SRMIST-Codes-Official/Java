class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int x : nums1)
            map1.put(x, map1.getOrDefault(x,0)+1);

        for(int x : nums2)
            map2.put(x, map2.getOrDefault(x,0)+1);

        HashSet<Integer> set = new HashSet<>();
        set.addAll(map1.keySet());
        set.addAll(map2.keySet());

        int cost = 0;

        for(int x : set){

            int c1 = map1.getOrDefault(x,0);
            int c2 = map2.getOrDefault(x,0);

            int total = c1 + c2;

            if(total % 2 != 0)
                return -1;

            int required = total / 2;

            if(c1 > required)
                cost += c1 - required;
        }

        return cost;
        
    }
}