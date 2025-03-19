import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] arr2d = new int[N][M];
        int[][] arr2d_1 = new int[N][M];
        int[][] arr2d_2 = new int[N][M];

        
            
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr2d_1[i][j] = sc.nextInt();
            }
        }
            
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr2d[i][j] == arr2d_1[i][j]) {
                    arr2d_2[i][j] = 0;
                }
                else {
                    arr2d_2[i][j] = 1;
                }
                System.out.print(arr2d_2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


