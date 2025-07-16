import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height, weight, number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if (student.height == this.height) {
            if(student.weight == this.weight) {
                return this.number - student.number;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  
        Student[] students = new Student[n]; 
       
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int number = i + 1;

            students[i] = new Student(height, weight, number);
        }
        Arrays.sort(students);
        
        for (int i = 0; i < n; i++) {
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.println(students[i].number + " ");
        }
    }
}
//내림차순