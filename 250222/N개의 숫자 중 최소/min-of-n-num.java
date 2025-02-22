import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int INT_MAX = Integer.MAX_VALUE;

        int arr[] = new int[100];
        int N = sc.nextInt();
        int minVal = INT_MAX;
        int cntMin = 0;


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if(arr[i] == minVal) {
                cntMin++;
            }
        }
        System.out.print(minVal + " " + cntMin);
    }
}