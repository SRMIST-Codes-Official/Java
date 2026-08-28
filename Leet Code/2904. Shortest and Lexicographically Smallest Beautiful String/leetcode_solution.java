class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> l=new ArrayList<>();
        int size=101;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='1'){
                continue;
            }
            int c=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    c++;
                }
                if(c==k){
                    String temp=s.substring(i,j+1);
                    if(temp.length()==size){
                        l.add(temp);
                        break;
                    }else if(temp.length()<size){
                        l.clear();
                        l.add(temp);
                        size=temp.length();
                        break;
                    }
                }
            }
        }
        Collections.sort(l);
        if(l.size()==0){
            return "";
        }
        return l.get(0);
    }
}