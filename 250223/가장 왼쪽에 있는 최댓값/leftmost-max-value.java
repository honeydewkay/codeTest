import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        int N = sc.nextInt();
        int arr[] = new int[1000];
        int arr2[] = new int[1000];
        
        
        

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        while(true) {
            int idx = -1;
            int maxVal = INT_MIN;
            for(int i = 0; i < N; i++) {
                if(maxVal < arr[i]) {
                    maxVal = arr[i];
                    idx = i;
                }
            }

            System.out.print(idx + 1 + " ");

            if (idx == 0) {
                break;
            }  
            arr[idx] = INT_MIN;
            N = idx;
           
        }
    }
}