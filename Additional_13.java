package home_work.week1_additional;


//13) ƒаны три числа A,B,C. ”величить числа в два
//раза, если A+B+C>0, в противном случае заменить на нули.


import java.util.Scanner;

public class Additional_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A");
        int numberA = sc.nextInt();
        System.out.println("Enter a number B");
        int numberB = sc.nextInt();
        System.out.println("Enter a number C");
        int numberC = sc.nextInt();
        if (numberA + numberB + numberC >0){
            numberA = numberA*2;
            numberB = numberB*2;
            numberC = numberC*2;
            System.out.println("The numbers were doubled" + " " + numberA + " " + numberB + " " + numberC);
        }else{
            if(numberA + numberB + numberC <= 0){
                numberA = 0;
                numberB = 0;
                numberC = 0;
                System.out.println
                        ("The numbers are replaced by 0"+ " " + "A=" + numberA +" "+ "B=" + numberB + " "+ "C=" + numberC);
            }
        }





    }
}
