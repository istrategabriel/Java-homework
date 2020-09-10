package ForandWhile;

public class Homework4 {

        //Exercitiul 1
    /*
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
        for (int i=start; i<=end; i++){
            if (isDivisible(i, divisor)){
                sum +=i;
            }
        }
        return sum;
        }

*/

    //Exercitiul 2

    /*

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

    static int rangeSum2(int [] array, int divisor){
        int sum=0;
        for (int i:array) {
            if (i < 0) {
                return sum;
            }
        }
                for (int j:array){
                        if (isDivisible(j, divisor)){
                        sum +=j;
            }
        }
        return sum;
    }

*/

    //Exercitiul 3

    /*

    static void convertFromSeconds (int nrofseconds){
        if (nrofseconds <0){
            System.out.println("Seconds should be positive");

        return;
        }

        int hours = nrofseconds/3600;
        int minutes = (nrofseconds%3600)/60;
        int seconds = nrofseconds-((hours*3600)+(minutes*60));

        System.out.println("H"+hours +"-"+"M"+minutes+"-"+"S"+seconds);


    }
*/


    static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = bigCount * 5 + smallCount;
        if (sum < goal) {
            return false;
        } else if (sum == goal) {
            return true;
        } else if (sum > goal) {
            if (bigCount != 0 && smallCount != 0 && goal % 5 < smallCount) {
                return true;
            } else if (bigCount == 0 && smallCount != 0 && goal < smallCount) {
                return true;
            } else if (bigCount != 0 && smallCount == 0) {
                return false;
            }
        }
return false;

    }
    public static void main(String[] args) {

        //System.out.println(rangeSum(-1,12,6));

        //System.out.println(rangeSum2(new int[]{1, 0, 3, 4},4));
        //System.out.println(rangeSum2(new int[]{1, 8, -3, 4},4));
        //convertFromSeconds(3600);
       // convertFromSeconds(3599);
       // convertFromSeconds(61238);
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(1,-1,4));

    }

}