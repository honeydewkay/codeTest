import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MIN = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[1000];
        int maxVal = INT_MIN;
        int value = -1;
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(arr[i] <= arr[i + 1]){
                for(int j = i + 1; j < N; j++) {
                    if(maxVal < arr[j] - arr[i]) {
                        maxVal = arr[j] - arr[i];
                    }
                }
            }
        }
        if(maxVal < 0) { 
            System.out.print(0);
        }
        else { 
            System.out.print(maxVal);
        }
    }
}