import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int INT_MIN = Integer.MIN_VALUE;
        int N = sc.nextInt();
        int maxVal = INT_MIN;
        int arr[] = new int[1000];
        int countArr[] = new int[1001];
        int cnt = 0;
        boolean check = false;
        

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }
        
        for(int i = 0; i < N; i++) {
            
            if(countArr[arr[i]] == 1) {
                check = true;
                if(maxVal < arr[i]) {
                    maxVal = arr[i];
                }
            }
        }
        if(check) {
            System.out.print(maxVal);
        }
        else {
            System.out.print(-1);
        }
    }
}