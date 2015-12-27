package home_work.week1_additional;


//2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
//тельные заменить на 0.


import java.util.Scanner;

public class Additional_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();
        System.out.println("Enter the third number");
        int third = sc.nextInt();
        if(first>0){
            first=first*first*first;
            System.out.println(first);
        }else{
            first=0;
            System.out.println(first);

        }
        if(second>0){
            second=second*second*second;
            System.out.println(second);
        }else{
            second=0;
            System.out.println(second);

        }
        if(third>0){
            third=third*third*third;
            System.out.println(third);
        }else{
            third=0;
            System.out.println(third);

        }
    }
}
