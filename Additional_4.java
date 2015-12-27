package home_work.week1_additional;


//4) »звестны две скорости, одна в километрах в час, друга€ в метрах в секун-
//ду.  ака€ из них больше?


import java.util.Scanner;

public class Additional_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed in km/h");
        double speedKmH = sc.nextDouble();
        System.out.println("Enter the speed in m/second");
        double speedMSecond = sc.nextDouble();
        if(speedKmH > (speedMSecond*3.6)){
            System.out.println("Speed km/h more speed meters / second");
        }else if(speedKmH < (speedMSecond*3.6))
        {
            System.out.println("Speed km/h less than the speed of meters / second");
        }else {
            System.out.println("The entered value of the same");
        }

    }
}
