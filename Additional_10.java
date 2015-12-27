package home_work.week1_additional;

//Написать программу вычисления стоимости переговоров, если по субботам
// и воскресеньям предоставляется 20% скидка. Ввести продолжительность
// разговора и день недели (цифра от 1 до 7).

import java.util.Scanner;

public class Additional_10 {
    public static void main(String[] args) {
        System.out.println("Cost of 1 hour talks 10 $");
        int cost = 10;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the call duration in hours");

        int time = sc.nextInt();
        System.out.println("Enter the weekday (1 to 7)");
        int weekday = sc.nextInt();
        if(weekday>=1 & weekday<=5){
            cost = cost*time;
            System.out.println("Cost of call = " + cost);
        }
        if (weekday==6 || weekday==7 & time>=0){
            int sale=time*cost*20/100;
            cost=(cost*time)-sale;
            System.out.println("The rate with discount = " + cost);
        }
        if(weekday<=0 || time<0){
            System.out.println("You entered is not a valid number");
        }
    }
}
