class Pair{
    String first;
    int second;
    Pair(String first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> st=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            st.add(wordList.get(i));
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        st.remove(beginWord);
        while(!q.isEmpty()){
            String node=q.peek().first;
            int dis=q.peek().second;
            if(node.equals(endWord)){
               return dis;
            }
            q.remove();
            for(int i=0;i<node.length();i++){
                char[] split=node.toCharArray();
                for(char c='a';c<='z';c++){
                    split[i]=c;
                    String newst=new String(split);
                    if(st.contains(newst)){
                        q.add(new Pair(newst, dis+1));
                        st.remove(newst);
                    }
                }
            }
        }
        return 0;
    }
}