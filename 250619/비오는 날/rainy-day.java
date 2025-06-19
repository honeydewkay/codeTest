import java.util.Scanner;
import java.util.Arrays;

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weather = new Weather[n];
        int index = -1;

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weathers = sc.next();
            weather[i] = new Weather(date, day, weathers);
        

            if(weather[i].weather.equals("Rain")) { 
                if(index == -1 || weather[i].date.compareTo(weather[index].date) < 0) {
                index = i;
                }
            }
        }

        System.out.print(weather[index].date + " " +  weather[index].day + " " + weather[index].weather);

    }
}