class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = 99999;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, arr[i + 1] - arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                list.add(temp);
            }
        }
        return list;

    }
}