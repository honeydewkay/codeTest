import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        int arr[] = new int[101];
        int minVal = INT_MAX;
        int maxVal = INT_MIN;
        int idx = -1;
    
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999) {
                idx = i;
                break;
            }
        }
        for (int i = 0; i < idx; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
            else if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        System.out.print(maxVal + " " + minVal); 
    }
}