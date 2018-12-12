package day1;

public class LongExample {

/*    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;*/

    public static void main(String[] args) {
        // oblicza odległość jaką światło pokona w podanej liczbie dni

        int lightSpeed = 300_000;
        long numberOfDays = 500;
        long seconds;
        long distance; // wynik mógłby z pewnością nie zmieścić się w int
        seconds = numberOfDays * 24 * 60 * 60;
        //sekundy = liczbaDni * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
        distance = lightSpeed * seconds;
        System.out.println("W " + numberOfDays + " dni światło przebędzie " + distance + " kilometrów");
    }
}
