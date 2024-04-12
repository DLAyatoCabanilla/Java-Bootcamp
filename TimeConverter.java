public class TimeConverter {
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int hours = seconds / 3600;
        int remainingMinutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(hours, remainingMinutes, remainingSeconds);
    }

    public static String getDurationString(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            return "Invalid value";
        }

        return String.format("%02dh %02dm", hours, minutes);
    }

    public static String getDurationString(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || seconds < 0 || minutes >= 60 || seconds >= 60) {
            return "Invalid value";
        }

        return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3665)); // Should print "01h 01m 05s"
        System.out.println(getDurationString(1, 5)); // Should print "01h 05m"
    }
}
