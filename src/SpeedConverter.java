public class SpeedConverter {

    public  static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return  -1;
        }
        long milesPerHour= Math.round(kilometersPerHour/1.609);
        return  milesPerHour;
    }
    public static void printConversion(double kilometerPerHour){
        if(kilometerPerHour<0){
            System.out.println("invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour +
                    " k/h = "+ milesPerHour+ " mi/h"
                    );
        }
    }
}
