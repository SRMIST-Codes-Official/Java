class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        Stack<Integer> st=new Stack<>();
        int c=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            st.add(node);
            c++;
            for(int i: adj.get(node)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.add(i);
                }
            }
        }
        if(c!=numCourses){
            return new int[0];
        }
        int[] ans=new int[numCourses];
        int j=0;
        while(!st.isEmpty()){
            ans[j++]=st.pop();
        }
        return ans;
    }
}