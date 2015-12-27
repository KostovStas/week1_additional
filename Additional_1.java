package home_work.week1_additional;

//1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
//лить, является ли он прямоугольным. Ответ вывести в виде сообщения.


import java.util.Scanner;

public class Additional_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side A of the triangle ");
        int sideA = sc.nextInt();
        System.out.println("Enter side B of the triangle ");
        int sideB = sc.nextInt();
        System.out.println("Enter side C of the triangle ");
        int sideC = sc.nextInt();
        if(sideA*sideA==sideB*sideB+sideC*sideC || sideB*sideB==sideA*sideA+sideC*sideC || sideC*sideC==sideB*sideB+sideA*sideA)
        {
            System.out.println("The triangle is isosceles");
        } else{
            System.out.println("The triangle is not isosceles");
        }

    }
}
