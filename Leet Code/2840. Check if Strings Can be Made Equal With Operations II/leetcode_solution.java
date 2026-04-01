class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap<Character, Integer> ems1=new HashMap<>();
        HashMap<Character, Integer> oms1=new HashMap<>();
        HashMap<Character, Integer> ems2=new HashMap<>();
        HashMap<Character, Integer> oms2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                ems1.put(s1.charAt(i), ems1.getOrDefault(s1.charAt(i),0)+1);
                ems2.put(s2.charAt(i), ems2.getOrDefault(s2.charAt(i),0)+1);
            }else{
                oms1.put(s1.charAt(i), oms1.getOrDefault(s1.charAt(i),0)+1);
                oms2.put(s2.charAt(i), oms2.getOrDefault(s2.charAt(i),0)+1);
            }
        }
        if(ems1.equals(ems2) && oms1.equals(oms2)){
            return true;
        }
        return false;
    }
}