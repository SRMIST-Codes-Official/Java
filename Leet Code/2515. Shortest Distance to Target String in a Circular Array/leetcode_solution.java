class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int dis = 101;
        int l = words.length;
        for (int i = 0; i < l; i++) {
            if (words[i].equals(target)) {
                dis = Math.min(dis, Math.abs(i - startIndex));
                if (i < startIndex) {
                    dis = Math.min(dis, (l - startIndex + i));
                } else {
                    dis = Math.min(dis, (l - i + startIndex ));
                }
            }
        }
        if (dis == 101) {
            return -1;
        }
        return dis;
    }
}