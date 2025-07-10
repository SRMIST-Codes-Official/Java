class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int n = s.length() / 2;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) c++;
            if (vowels.indexOf(s.charAt(i + n)) != -1) c--;
        }

        return c == 0;
    }
}