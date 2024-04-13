public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            return -1;
        }
        double milesPerHour = kilometersPerHour / 1.609;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1)
        {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
