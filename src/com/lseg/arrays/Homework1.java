package com.lseg.arrays;

import javax.naming.InitialContext;
import java.util.Arrays;

public class Homework1 {



    public static int [] arrayRotation(int [] initialArray){
        for (int i=0; i<=initialArray.length/2-1; i++){
            int temp = initialArray[i];
            initialArray[i]= initialArray[initialArray.length-1-i];
            initialArray[initialArray.length-1-i]= temp;}
        System.out.println("Rotated Array: " + Arrays.toString(initialArray));
            return initialArray;


        }



    public static void main(String[] args) {

        arrayRotation(new int []{1,2,4,6});
        arrayRotation(new int []{1,20,46,6, 4});



    }
}