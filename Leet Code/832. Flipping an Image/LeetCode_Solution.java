class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flip=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1;j>=0;j--){
                if(image[i][j]==0){
                    flip[i][image.length-1-j]=1;
                }else{
                    flip[i][image.length-1-j]=0;
                }
            }
        }
        return flip;
    }
}