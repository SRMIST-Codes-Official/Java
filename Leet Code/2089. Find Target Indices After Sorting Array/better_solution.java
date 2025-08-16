class Solution {
    public String largestGoodInteger(String num) {
        String[] good={"999","888","777","666","555","444","333","222","111","000"};
        for(int i=0;i<good.length;i++){
            if(num.contains(good[i])){
                return good[i];
            }
        }
        return "";
    }
}