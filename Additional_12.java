package home_work.week1_additional;


//12) �������� ���������, ������� � ����������� �� ��������� ����� ������
//��������� � ��� �������� �� 1�� 4 �/� - ������ (1); �� 5-10 �/c -��������� (2);
// �� 9-18 �/c - ������� (3); ������ 19 �/c - ��������� (4).


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
