class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] div = new String[(int) Math.ceil((double) s.length() / k)];
        int j = 0;
        for (int i = 0; i < s.length() / k; i++) {
            div[i] = s.substring(j, j + k);
            j = j + k;
        }
        div[div.length - 1] = s.substring((div.length - 1) * k);
        if (div[div.length - 1].length() < k) {
            for (int i = 0; i < k - s.length() % k; i++) {
                div[div.length - 1] = div[div.length - 1] + fill;
            }
        }
        return div;

    }
}