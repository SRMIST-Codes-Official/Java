class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < responses.size(); i++) {
            HashMap<String, Integer> count = new HashMap<>();
            for (int j = 0; j < responses.get(i).size(); j++) {
                count.put(responses.get(i).get(j), count.getOrDefault(responses.get(i).get(j), 0) + 1);
            }
            for (String key : count.keySet()) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        int max = 0;
        String ans = "";
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            int val=e.getValue();
            String key=e.getKey();
            if (val > max) {
                max = val;
                ans = key;
            } else if (max == val) {
                if (key.compareTo(ans) < 0) {
                    ans = key;
                }
            }
        }
        return ans;
    }
}