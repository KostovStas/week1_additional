package home_work.week1_additional;


import java.util.Scanner;

//6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
// время=расстояние/скорость
public class Additional_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the distance (km)");
        double distance=sc.nextDouble();
        System.out.println("Enter speed (km/h)");
        double speed=sc.nextDouble();
        double time=distance/speed;
        System.out.println("The time for which you have come to the point"+ " " +time + "h");


    }
}
