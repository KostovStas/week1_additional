package home_work.week1_additional;


//9) Написать программу вычисления идеального веса пользователя (рост-
//100). Выдать рекомендации о необходимости поправиться либо похудеть.


import java.util.Scanner;

public class Additional_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height");
        int height = sc.nextInt();
        System.out.println("Enter your weight");
        int weight = sc.nextInt();
        int height100 = height-100;
        if(height100<weight){
            System.out.println("You need to lose weight");
        }
        if(height100>weight){
            System.out.println("you need to gain weight");
        }
        if(height100==weight){
            System.out.println("You have an ideal weight");
        }

    }
}
