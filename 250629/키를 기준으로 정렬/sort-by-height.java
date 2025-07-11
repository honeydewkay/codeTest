import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int height, weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            students[i] = new Student(name, height, weight);
        }

        // 국어 점수 기준 오름차순
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.height - b.height;
            }
        }
        ); 

       for (int i = 0; i < n; i++) {
        System.out.print(students[i].name + " ");
        System.out.print(students[i].height + " ");
        System.out.print(students[i].weight + " ");
        System.out.println();
       }
    }
}