import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[10];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int dif = 10000;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++){
                int nowDif = arr[j] - arr[i];
                if (nowDif < dif) { 
                    dif = nowDif;
                }
            }
        }
        System.out.print(dif);
    }
}