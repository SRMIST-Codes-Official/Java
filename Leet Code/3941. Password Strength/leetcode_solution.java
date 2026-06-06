class Solution {
    public int passwordStrength(String password) {
        Set<Character> s=new HashSet<>();
        for(char c:password.toCharArray()){
            s.add(c);
        }
        int p=0;
        for(char c: s){
            if(Character.isLowerCase(c)){
                p+=1;
            }else if(Character.isUpperCase(c)){
                p+=2;
            }else if(Character.isDigit(c)){
                p+=3;
            }else{
                p+=5;
            }
        }
        return p;

    }
}