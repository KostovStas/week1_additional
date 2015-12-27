package home_work.week1_additional;

//Íàïèñàòü ïğîãğàììó, êîòîğàÿ ïğè ââîäå ÷èñëà â äèàïàçîíå îò 1 äî 99
//äîáàâëÿåò ê íåìó ñëîâî "êîïåéêà" â ïğàâèëüíîé ôîğìå.
// Íàïğèìåğ, 1 êîïåéêà, 5 êîïååê, 42 êîïåéêè

import java.util.Scanner;

public class Additional_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in the range 1-99");
        int number = sc.nextInt();
        if(number==1 || number==21 || number==31 || number==41 || number==51 || number==61
                || number==71 || number==81 || number==91){

            System.out.println(number +" "  +"kopeyka");
        }
        if(number>=2 & number<=4 || number>=22 & number<=24 || number>=32 & number<=34 ||
                number>=42 & number<=44 || number>=52 & number<=54 || number>=62 & number<=64 ||
                number>=72 & number<=74 || number>=82 & number<=84 || number>=92 & number<=94){

            System.out.println(number + " " + "kopeiki");
        }
        if(number>=5 & number<=20 || number>=25 & number<=30 || number>=35 & number<=40 ||
                number>=45 & number<=50 || number>=55 & number<=60 || number>=65 & number<=70 ||
                number>=75 & number<=80 || number>=85 & number<=90 || number>=95 & number<=99){
            System.out.println(number +" " + "kopeek");
        }else{
            System.out.println("Not the correct input");
        }

    }
}
