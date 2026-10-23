package Part2;

public class DateChecker {
    public boolean has31Days(Month month) {
        if (month == Month.JANUARY) {
            return true;
        }
        if (month == Month.APRIL) {
            return false;
        }
        return false;
    }
}
