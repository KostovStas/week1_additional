package home_work.week1_additional;


//Известны площади круга и квадрата. Определить: а) уместится ли круг в
//квадрат; б) уместится ли квадрат в круге.


import java.util.Scanner;

public class Additional_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of the square");
        double areaSquare = sc.nextDouble();
        System.out.println("Enter the area of a circle");
        double areaCircle = sc.nextDouble();
        double  diameterCircle =(2 * (Math.sqrt(areaCircle)))/3.1415;
        double sideSquare = Math.sqrt(areaSquare);
        double diagonalSquare = Math.sqrt(2 * areaSquare);
        if(sideSquare<=diameterCircle){
            System.out.println("The square is placed in a circle");
        }else{
            System.out.println("Square does not fit into the circle");
        }


    }
}
