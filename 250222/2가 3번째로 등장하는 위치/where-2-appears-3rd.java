import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[100];
        int cnt = 0;
        int idx = -1;
        

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(arr[i] == 2) {
                cnt++;
            }
            if(cnt == 3) {
                idx = i;
                System.out.print(idx + 1);
                break;
            }
        }
    }
}