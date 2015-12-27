package home_work.week1_additional;


//3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
//одинаковые; б) есть ли среди его цифр одинаковые.


import java.util.Scanner;

public class Additional_3 {
    public static void main(String[] args) {
        int [] mass =new int [3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number 3-digit numbers");
        mass[0]=sc.nextInt();
        System.out.println("Enter the second number 3-digit numbers");
        mass[1]=sc.nextInt();
        System.out.println("Enter the third number 3-digit numbers");
        mass[2]=sc.nextInt();
        if(mass[0]==mass[1] & mass[1]==mass[2]){
            System.out.println("all digits are the same");
        }else if(mass[0]==mass[1]|| mass[1]==mass[2] || mass[2]==mass[0]){
            System.out.println("two digits identical");
        }else{
            System.out.println("all the digits entered in the number of different");
        }

    }
}
