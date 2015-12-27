package home_work.week1_additional;


//Определить, является ли шестизначное число "счастливым" (сумма
//первых трех цифр равна сумме последних трех цифр)


import java.util.Scanner;

public class Additional_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = new int [6];
        System.out.println("Enter the first number");
        array[0]=sc.nextInt();
        System.out.println("Enter the second number");
        array[1]=sc.nextInt();
        System.out.println("Enter the third number");
        array[2]=sc.nextInt();
        System.out.println("Enter the fourth number");
        array[3]=sc.nextInt();
        System.out.println("Enter the fifth number");
        array[4]=sc.nextInt();
        System.out.println("Enter the sixth number");
        array[5]=sc.nextInt();

        if(array[0]+array[1]+array[2]==array[3]+array[4]+array[5]) {
            int sum1 = array[0] + array[1] + array[2];
            int sum2 = array[3] + array[4] + array[5];

            System.out.println("Your ticket is  lucky" + " " + sum1 + " " + sum2);

            for (int i = 0; i < array.length; i++)
            {
               System.out.print(array[i]+ " ");
            }

        }
        else {
            System.out.println("Your ticket is not lucky");
        }



    }
}

