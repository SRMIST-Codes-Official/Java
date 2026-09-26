class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        String res="";
        String b="";
        boolean inb=false;
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='('){
                inb=true;
            }else if(t==')'){
                inb=false;
            }
            if(inb==true && t!='('){
                b=b+t;
            }else if(t!=')' && t!='('){
                res=res+t;
            }
            if(t==')'){
                if(map.get(b)==null){
                    res=res+'?';
                }else{
                    res=res+map.get(b);
                }
                b="";
            }
        }
        return res;

    }
}