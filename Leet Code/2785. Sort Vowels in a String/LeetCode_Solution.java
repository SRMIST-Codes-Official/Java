class Solution {
    public String sortVowels(String s) {
        char[] c = s.toCharArray();
        int[] arr=new int[c.length];
        int j=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                arr[j]=(int)c[i];
                j++;
                c[i]='0';
            }
        }
        Arrays.sort(arr);
        int r=c.length-j;
        for(int i=0;i<c.length;i++){
            if(c[i]=='0'){
                c[i]=(char)arr[r];
                r++;
            }
        }
        return String.valueOf(c);
    }
}