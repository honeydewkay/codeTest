import java.util.Scanner;
import java.util.Arrays;

class Person {
    String names;
    String addresses;
    String regions;

    public Person(String names, String addresses, String regions) {
        this.names = names;
        this.addresses = addresses;
        this.regions = regions;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        Person[] person = new Person[n];

        int index = 0;
        
        for (int i = 0; i < n; i++) {

            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
            person[i] = new Person(names[i], addresses[i], regions[i]);
            

            if(person[i].names.compareTo(person[index].names) > 0) {
                index = i;
            }
        }
       
        System.out.println("name " + person[index].names);
        System.out.println("addr " + person[index].addresses);
        System.out.println("city " + person[index].regions);
      
    }
}