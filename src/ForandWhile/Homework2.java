package ForandWhile;

import java.util.Arrays;
import java.util.Scanner;


public class Homework2 {


    public static void main(String[] args) {
        /*
    }
        //First exercise
        System.out.println("Matricea 1");
        int[][] matricea1 = new int[10][10];
        for (int i = 0; i <= matricea1.length - 1; i++) {
            for (int j = 0; j <= matricea1.length - 1; j++) {
                matricea1[i][j] = j;

                System.out.print(matricea1[i][j] + " ");
            }
            System.out.println();
            // End of first exercise

         */

        //Second exercise
          /*  System.out.println("Matricea 2");
            int[][] matricea2 = new int[10][10];
            for (int i = 0; i <= matricea2.length - 1; i++) {
              matricea2[i][i] = 1;
            }

                for (int k=0; k <= matricea2.length - 1; k++) {
                    for (int j=0; j<= matricea2.length - 1; j++)
                        System.out.print(matricea2[k][j] + "");

               System.out.println();

    }

                // End of second exercise

           */

        //Third exercise
          /* System.out.println("Matricea 3");
            int[][] matricea3 = new int[10][10];
            for (int i = 0; i <= matricea3.length - 2; i++) {
              matricea3[i][i+1] = 1;
            }

                for (int k=0; k <= matricea3.length - 1; k++) {
                    for (int j=0; j<= matricea3.length - 1; j++)
                        System.out.print(matricea3[k][j] + "");

               System.out.println();

    }

                // End of third exercise

           */


        //  4th exercise
         /* System.out.println("Matricea 4");
            int[][] matricea4 = new int[10][10];
            for (int i = 0; i <= matricea4.length - 1; i++) {
              matricea4[i][matricea4.length-1-i] = 1;
            }

                for (int k=0; k <= matricea4.length - 1; k++) {
                    for (int j=0; j<= matricea4.length - 1; j++)
                        System.out.print(matricea4[k][j] + "");

               System.out.println();

    }

                // End of 4th exercise

        */

        //8th exercise
        /*


        int[] Array = new int[]{-1, -2, 4, 8, -100};

        for (int i = 0; i <= 4; i++) {

            for (int k = 1; k <= 4; k++) {

                if (Array[k-1] > Array[k]) {
                    int temp = Array[k-1];
                    Array[k-1]= Array[k];
                    Array[k] = temp;

                }
            }
        }
        for (int l=0; l<=4; l++){
            System.out.print(Array[l]+" ");
        }

         */

// While - exercitiul 1 si 2

/*
        int n = 8;
        int incercari = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introuceti un numar");
        int numarintrodus = scanner.nextInt();

        while (numarintrodus != n) {
            if (numarintrodus < n) {
                System.out.println("Numarul este mai mare");

            } else {
                System.out.println("Numarul este mai mic");
            }

            System.out.println();
            System.out.println("Introuceti alt numar");
            incercari++;
            numarintrodus = scanner.nextInt();
        }

        System.out.println("Felicitari, ati ghicit numarul in" + " "+(incercari+1)+ " incercari");

 */

        // While exercitiul 3
        /*

        int numarul1, numarul2, suma;
        numarul2=1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introuceti primul numar");
        numarul1 = scanner.nextInt();

        while (numarul1!=0 && numarul2!=0){
            System.out.println("Introuceti urmatorul numar");
            numarul2 = scanner.nextInt();
            System.out.println("Suma numerelor introduse este:");
            suma=numarul1 + numarul2;
            numarul1= suma;
            System.out.println(suma);
            System.out.println();

        }

         */

        //While exercitiul 4

        /*
        int numarul1, numarul2, numarul3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introuceti primul numar");
        numarul1 = scanner.nextInt();
        System.out.println("Introuceti al doilea numar");
        numarul2 = scanner.nextInt();
        System.out.println("Introuceti al treilea numar");
        numarul3 = scanner.nextInt();

        if ((numarul1+numarul2>numarul3)&&(numarul1+numarul3>numarul2)&&(numarul2+numarul3>numarul1)) {
            System.out.println("Numerele introduse pot fi laturile unui triunghi");
                    }
        else {
            System.out.println("Numerele introduse nu pot forma un triunghi");
        }

*/

        /*
        //While exercitiul 7

        int pin = 1234;
        int numarintrodus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introuceti codul pin");
        numarintrodus = scanner.nextInt();
        if (pin !=numarintrodus) {
            System.out.println("Introuceti codul pin din nou");
            numarintrodus = scanner.nextInt();
            if (pin !=numarintrodus) {
                System.out.println("Introuceti codul pin din nou");
                numarintrodus = scanner.nextInt();
                if (pin !=numarintrodus) {
                    System.out.println("Card blocat in bancomat");
                }
            }
        }
        if (pin == numarintrodus) {
            System.out.println("Buna ziua! Ce operatiune vreti sa efectuati?");
        }
*/

        //Switch exercitiul 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduti ziua saptamanii pentru a primi horoscopul");
        int ziua = scanner.nextInt();
        switch (ziua){
            case 0:
                System.out.println("Astazi vei primi bani. Baga toate economiile la Loto");
                break;
            case 1:
                System.out.println("Astazi iti vei intalni jumatatea. Ia un buchet de flori cu tine!");
                break;
            case 2:
                System.out.println("Nu fa investiit majore astazi. Pastreaza banii pentru weekend!");
                break;
            case 3:
                System.out.println("Venus s-a intalnit cu Saturn si este in umbra lui Jupiter. Nu iesi din cas aastazi!");
                break;
            case 5:
                System.out.println("Hai ca vine weekend-ul!");
                break;
            case 4:
                System.out.println("Astazi este o zi buna pentru mers la teatru sau la...Eden");
                break;
            case 6:
                System.out.println("Iesi din casa si distreaza-te cu prietenii!");
                break;

        }

    }
    }
















