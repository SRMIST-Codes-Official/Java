class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        ArrayList<String> list= new ArrayList<>();
        ArrayList<String> l1= new ArrayList<>();
        ArrayList<String> l2= new ArrayList<>();
        ArrayList<String> l3= new ArrayList<>();
        ArrayList<String> l4= new ArrayList<>();
        for(int i=0;i<isActive.length;i++){
            if(isActive[i] && businessLine[i].equals("electronics")){
                if(code[i].matches("[a-zA-Z0-9_]+")){
                    l1.add(code[i]);
                }
            }
        }
        Collections.sort(l1);
        for(int i=0;i<isActive.length;i++){
            if(isActive[i] && businessLine[i].equals("grocery")){
                if(code[i].matches("[a-zA-Z0-9_]+")){
                    l2.add(code[i]);
                }
            }
        }
        Collections.sort(l2);
        for(int i=0;i<isActive.length;i++){
            if(isActive[i] && businessLine[i].equals("pharmacy")){
                if(code[i].matches("[a-zA-Z0-9_]+")){
                    l3.add(code[i]);
                }
            }
        }
        Collections.sort(l3);
        for(int i=0;i<isActive.length;i++){
            if(isActive[i] && businessLine[i].equals("restaurant")){
                if(code[i].matches("[a-zA-Z0-9_]+")){
                    l4.add(code[i]);
                }
            }
        }
        Collections.sort(l4);
        list.addAll(l1);
        list.addAll(l2);
        list.addAll(l3);
        list.addAll(l4);
        return list;
    }
}