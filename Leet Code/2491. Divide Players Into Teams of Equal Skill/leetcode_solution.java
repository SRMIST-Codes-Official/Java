class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long chem=skill[0]*skill[n-1];
        int ts=skill[0]+skill[n-1];
        for(int i=1;i<n/2;i++){
            if(skill[i]+skill[n-1-i] != ts){
                return -1;
            }else{
                chem=chem+(skill[i]*skill[n-1-i]);
            }
        }
        return chem;
    }
}