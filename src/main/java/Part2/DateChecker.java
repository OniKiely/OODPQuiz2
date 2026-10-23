package Part2;

public class DateChecker {
    public boolean has31Days(Month month) {
        if (month == null) {
            return false;
        }

        switch (month) {
            case Month.JANUARY:
                return true;
            case Month.MARCH:
                return true;
            case Month.MAY:
                return true;
            case Month.JULY:
                return true;
            case Month.AUGUST:
                return true;
            case Month.OCTOBER:
                return true;
            case Month.DECEMBER:
                return true;
            default:
                return false;
        }
    }
}
