package com.lseg.arrays;

public class ArrayHomework {
    public static void main(String[] args) {


        int[] Array_to_be_rotated = new int[10];
        System.out.print("Componenta initiala a sirului ");
        for (int k = 0; k <= Array_to_be_rotated.length - 1; k++) {
            Array_to_be_rotated[k] = k+1;
            System.out.print(Array_to_be_rotated[k] +",");
        }
        System.out.println();
        System.out.print("Dupa rotatie componenta sirului este:");
        int [] Rotated_Aray = new int[10];
        for (int i = 0; i<= Array_to_be_rotated. length -8; i++) {
            Rotated_Aray[i] = Array_to_be_rotated [i+7];
            System.out.print(Rotated_Aray[i]+ ",");

        }
        for (int j=0; j<=Array_to_be_rotated.length -4; j++){
            Rotated_Aray[j+3]= Array_to_be_rotated[j];
            System.out.print(Rotated_Aray[j+3]+ ",");
        }
    }
}