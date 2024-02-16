package Arrays;

public class CountFrequencyOfEachElementInTheArray {
    static void countFreq(int [] arr){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            int count = 0;
            int x = arr[i];
            if(x==-1){
                continue;
            }
            for (int j = 0; j < n; j++) {
                if(arr[j] == x){
                    count ++;
                    arr[j] = -1;
                }
            }
            System.out.println("The frequency of " + x + ":" +  count);
        }
    }
    public static void main(String[] args) {
            int [] arr = {4,4,4,5,2,5,8,6,4,8,8,7,9,5};
            countFreq(arr);
    }
}
