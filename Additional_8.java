package home_work.week1_additional;

//8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
//тавляется, если сумма покупки превышает 1000 гривен.

import java.util.Scanner;

public class Additional_8 {
    public static void main(String[] args) {

        System.out.println("Enter the value of a thing");
        Scanner sc= new Scanner(System.in);
        int value = sc.nextInt();

        if(value<=0){
            System.out.println("the price can not be 0");
        }
        if (value<=1000 & value!=0){
            System.out.println("The amount of your purchase ="+ value );
        }
        if(value>1000){
            int temp = value/10;
            value = value-temp;
            System.out.println("The amount of your purchase with the discount ="+ value);

        }

    }
}
