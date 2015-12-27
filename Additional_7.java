package home_work.week1_additional;

//Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
//времени года. Если пользователь введет недопустимое число, программа
// должна выдать сообщение об ошибке.


import java.util.Scanner;

public class Additional_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of the month from 1 to 12");
        int numberMonth = sc.nextInt();
        if(numberMonth==12 || numberMonth== 1 || numberMonth==2){
            System.out.println("Winter in the yard");
        }
        if(numberMonth==3 || numberMonth== 4 || numberMonth== 5){
            System.out.println("Spring in the yard");
        }
        if(numberMonth==6 || numberMonth== 7 || numberMonth== 8){
            System.out.println("Summer in the yard");
        }
        if(numberMonth==9 || numberMonth== 10 || numberMonth== 11){
            System.out.println("Autumn in the yard");
        }if (numberMonth>12 || numberMonth<1){
            System.out.println("Wrong number");
        }

    }
}
