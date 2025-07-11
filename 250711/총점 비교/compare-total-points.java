import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int a, b, c;
    int sum;

    public Student(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c= c;
        this.sum = a + b + c;
    }

    @Override
    public int compareTo(Student student) { //오름차순
        return  this.sum - student.sum;
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] student = new Student[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            student[i] = new Student(name, a, b, c);
        
        }
        
        Arrays.sort(student);

        for (int i = 0; i < n; i++) {
            System.out.print(student[i].name + " ");
            System.out.print(student[i].a + " ");
            System.out.print(student[i].b + " ");
            System.out.println(student[i].c + " ");
        }
    }
    
}