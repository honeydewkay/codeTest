import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][4];
        double total_sum = 0;
        double ga_avg = 0;
        double se_avg = 0;
        double total_avg = 0;

        for(int i = 0; i < 2; i++){
            double ga_sum = 0;
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
                ga_sum = ga_sum += arr[i][j];
                ga_avg = ga_sum / 4;
                total_sum += arr[i][j];
            }
            System.out.printf("%.1f ",ga_avg);
        }
        System.out.println();
        for(int i = 0; i < 4; i++){
            double se_sum = 0;
            for(int j = 0; j < 2; j++){
                se_sum = se_sum += arr[j][i];
                se_avg = se_sum / 2;
            }
            System.out.printf("%.1f ",se_avg);
        }
        total_avg = total_sum / 8;
        System.out.println();
        System.out.printf("%.1f ",total_avg);
    }
}
