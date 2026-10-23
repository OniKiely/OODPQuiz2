package Part2;

public class DateChecker {
    public boolean has31Days(Month month) {
        if (month == Month.JANUARY) {
            return true;
        }
        if (month == Month.MARCH) {
            return true;
        }
        if (month == Month.MAY) {
            return true;
        }
        if (month == Month.JULY) {
            return true;
        }
        if (month == Month.AUGUST) {
            return true;
        }
        if (month == Month.OCTOBER) {
            return true;
        }
        if (month == Month.DECEMBER) {
            return true;
        }
        if (month == Month.APRIL) {
            return false;
        }
        return false;
    }
}
