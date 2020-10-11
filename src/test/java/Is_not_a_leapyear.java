import no.thomasj.leapYear.leapYearChecker;
import org.junit.jupiter.api.*;

public class Is_not_a_leapyear {

    @Test
    public void is_a_year_not_devidable_by_4_a_leapyear() {
        leapYearChecker inputYear = new leapYearChecker();

        int year = 2255; //ikke delig med 4

        boolean actual = inputYear.isLeapYear(year);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void is_a_year_devideble_by_100_but_not_400_a_leapyear() {
        leapYearChecker inputYear = new leapYearChecker();

        int year = 1500; //delbart med 100 men ikke 400

        boolean actual = inputYear.isLeapYear(year);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void is_a_year_devideble_by_4000_a_leapyear() {
        leapYearChecker inputYear = new leapYearChecker();

        int year = 8000; //ikke delbart med 4000

        boolean actual = inputYear.isLeapYear(year);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
