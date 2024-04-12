public class HeightConverter {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if ((feet < 0) || (inches < 0) || (inches > 12)){
            return -1;
        }
        double centimeters = (feet * 12 + inches) * 2.54;
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            System.out.println("Invalid inches value");
            return -1;
        }
        int feet = inches / 12;
        int remainingInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static void main(String[] args) {
        double centimeters1 = calcFeetAndInchesToCentimeters(5, 8);
        System.out.println("Total height in centimeters: " + centimeters1 + " cm");

        double centimeters2 = calcFeetAndInchesToCentimeters(68);
        System.out.println("Total height in centimeters: " + centimeters2 + " cm");
    }
}