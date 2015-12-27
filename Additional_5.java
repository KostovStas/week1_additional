package home_work.week1_additional;

import java.util.Scanner;

//5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
//пара равных
public class Additional_5 {
    public static void main(String[] args) {
        int[] mass = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        mass[0] = sc.nextInt();
        System.out.println("Enter the second number ");
        mass[1] = sc.nextInt();
        System.out.println("Enter the third number ");
        mass[2] = sc.nextInt();
        if (mass[0] == mass[1] || mass[1] == mass[2] || mass[2] == mass[0]) {
            System.out.println("The numbers are equal");
        } else {

            System.out.println("There is no identical pairs of numbers");
        }

    }
}
