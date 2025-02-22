import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        int N = sc.nextInt();
        int maxVal = INT_MIN;
        int arr[] = new int[1000];
        int countArr[] = new int[1000];
        

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }
        for(int i = 0; i < N; i++) {
            if(countArr[arr[i]] == 1 && maxVal < arr[i]) {
                maxVal = arr[i];
                System.out.print(maxVal);
                break;
            }
            else if (countArr[arr[i]] > 1 && i == N-1) {
                System.out.print(-1);
                break;
            }
        }
    }
}