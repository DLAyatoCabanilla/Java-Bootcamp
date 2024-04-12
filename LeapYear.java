public class LeapYear {
    // write code here
    public static boolean isLeapYear (int year)
    {
        if (year < 1 || year > 9_999)
        {
            return false;
        }
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}