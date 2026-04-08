class Solution {
    public List<String> stringSequence(String target) {
        List<String> l = new ArrayList<>();
        String f = "";
        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j <= target.charAt(i) - 'a'; j++) {
                l.add(f + (char) ('a' + j));
            }
            f = target.substring(0, i + 1);

        }
        return l;
    }
}