class Solution {
    public String destCity(List<List<String>> paths) {
        for(int i=0;i<paths.size();i++){
            String d=paths.get(i).get(1);
            boolean b=true;
            for(int j=0;j<paths.size();j++){
                if(d.equals(paths.get(j).get(0))){
                    b=false;
                    break;
                }
            }
            if(b){
                return paths.get(i).get(1);
            }
        }
        return "a";
    }
}