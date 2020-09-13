package Methods;

import DataTypes.Homework3;
import ForandWhile.Homework2;
import ForandWhile.Homework4;
import com.lseg.arrays.Homework1;
import com.lseg.arrays.Homework1;

import java.util.Scanner;


public class Homework5 {


    //Exercise 2
    static void countNumbersEntered(){
        Scanner scanner = new Scanner(System.in);
        int positive=0, negative=0, zeros=0, number;

        while (true) {
            System.out.println("Introduti un numar sau scrieti 112 pentru incetarea programului");
            number = scanner.nextInt();
            if (number ==112)
                break;
            if (number > 0)
                positive++;
            else if (number < 0)
                negative++;
            else if (number == 0)
                zeros++;
        }

        System.out.println("Numarul total de valori pozitive: "+ positive);
        System.out.println("Numarul total de valori negative: "+ negative);
        System.out.println("Numarul total de zero introduse: "+ zeros);
        }


        //Exercise 3

        static int factorial(int x){
        int temp = 1;
        for (int i=1; i<=x; i++){
            temp *=i;

        }
            return temp;
        }

        static double sinDeX(double x, int n){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numarul pentru care vreti sa calculati SIN");
             x= scanner.nextDouble();
            System.out.println("Introduceti numarul n pentru precizie");
            n= scanner.nextInt();
            double sin = 1.0;
            double temp = 0.0;

            int i=1;
            while (i<=n)
            {

               sin = temp + (Math.pow(x,i)/factorial(i) - Math.pow(x,i+2)/factorial(i+2));
               temp = sin;
               i=i+4;
            }
            System.out.println(sin);
            return sin;
        }

        //Exercise 4

    static boolean isDivisible(int number, int divisor){
        if (number<0){
            return false;
        }
        if (number%divisor==0){
            return true;
        }
        else {
            return false;
        }
    }

    static int rangeSum(int start, int end, int divisor){
        if ((start>end)|| (start<0)|| (end<0)){
            return -1;
        }
        int sum=0;
        int i=start;
        while (i<=end) {
            if (isDivisible(i, divisor)) {
                sum +=i;
            }
            i++;


        }
        return sum;
    }

    public static void main(String[] args) {

        Homework1.arrayRotation(new int[]{1, 2, 4, 6});
        Homework1.arrayRotation(new int[]{1, 20, 46, 6, 4});
        Homework2.messageForDay(5);
        System.out.println( Homework3.isCatPlaying(false, 30));
        System.out.println (Homework4.canPack(2,2,11));
        countNumbersEntered();
        sinDeX(1.0471,6);
        System.out.println( "Sin de numar este: " +java.lang.Math.sin(1.0471));
        System.out.println("Suma numerelor divizibile cu divizorul ales este: " +
                rangeSum(1,20,5));


    }
}
