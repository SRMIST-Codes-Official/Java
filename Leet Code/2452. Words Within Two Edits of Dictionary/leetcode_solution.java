class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> s=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                if(countdiff(queries[i],dictionary[j])<=2){
                    s.add(queries[i]);
                    break;
                }
            }
        }
        return s;
    }
    int countdiff(String a, String b){
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=(b.charAt(i))){
                c++;
            }
        }
        return c;
    }
}