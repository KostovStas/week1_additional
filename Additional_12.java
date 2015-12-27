package home_work.week1_additional;


//12) Написать программу, которая в зависимости от характера ветра выдает
//сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -умеренный (2);
// от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).


import java.util.Scanner;

public class Additional_12 {
    public static void main(String[] args) {
        System.out.println("Enter the nature of the wind on a scale from 1 to 4");
        Scanner sc = new Scanner(System.in);
        int windType = sc.nextInt();
        if(windType==1){
            System.out.println("Wind speed is 1 to 4 m/s low");
        }
        if(windType==2){
            System.out.println("Wind speed is 5-10 m/c-moderate");
        }
        if(windType==3){
            System.out.println("Wind speed is 9-18 m/c - strong");
        }
        if (windType==4){
            System.out.println("Wind speed is more 19 m/c - hurricane");
        }
        if(windType<=0 || windType>=5)
        {
            System.out.println("Not correct number");
        }

    }
}
