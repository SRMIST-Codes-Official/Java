class Solution {
    public boolean doesAliceWin(String s) {
        if(s.indexOf('a')!=-1 || s.indexOf('e')!=-1 || s.indexOf('i')!=-1 || s.indexOf('o')!=-1 || s.indexOf('u')!=-1 ){
            return true;
        }
        return false;
    }
}