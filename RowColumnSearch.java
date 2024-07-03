import java.util.Arrays;

public class RC_Search {
    public static void main(String[] args) {
        int arr[][] = {
                {10,20,30},
                {14,22,32},
                {18,25,39},
                {19,29,40}

        };
         int target;
        System.out.println(Arrays.toString(Search(arr,29)));

    }
    static int[] Search(int arr[][], int target){
        int r = 0;
        int c = arr.length-1;
        while( r < arr.length && c > 0){
            if (arr[r][c] == target ){
                return new int[]{r,c};
            }
            if (arr[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }



}

