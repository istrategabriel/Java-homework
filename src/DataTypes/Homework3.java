package DataTypes;

public class Homework3 {

    //Exercitul 1
    /*
    static double convertToKilometersPerHour(double milesPerHour)  {
        double kilometersPerHour = milesPerHour*1.60934;
        return kilometersPerHour;
    }

*/

//Exercitul 2
    /*
    static boolean shouldWakeUp(boolean barking, int hour){

        boolean shouldWakeup = false;
        if (hour<0 || hour>24){
            System.out.println("Invalid hour");
            return shouldWakeup;
        }

            if ((barking = true && hour < 8) || (barking = true && hour > 22)) {
                shouldWakeup = true;
            }

        return shouldWakeup;
    }
*/

//Exercitul 3
    /*

    static boolean isLeapYear(int year){
        boolean isleap = false;
        if (year<1 || year>9999){
            return isleap;
        }
                if (year%4==0){
                     if (year%100==0){
                            if (year%400==0){
                                 isleap= true;
                                     return isleap;
                }
            }

        }
        return isleap;
    }

     */

    public static boolean isCatPlaying( boolean summer, int temperature) {
        boolean playing = false;
        if (temperature>=25 && temperature<=35){
            playing=true;
            return playing;
        }
                else if (summer == true && (temperature>=25 && temperature<=45) ){
                    playing=true;
                     return playing;
        }
         return playing;
    }

    public static void main(String[] args) {
        System.out.println( isCatPlaying(false, 30));

    }

    }

