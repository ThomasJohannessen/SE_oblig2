import no.thomasj.leapYear.leapYearChecker;
import org.junit.jupiter.api.*;

public class Is_a_leapyear {
    @Test
    public void is_a_year_devided_by_4_but_not_100_a_leapyear() {
        leapYearChecker inputYear = new leapYearChecker();

        int year = 1656; //delbart med 4 men ikke 100

        boolean actual = inputYear.isLeapYear(year);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void is_a_year_devided_by_400_a_leapyear() {
        leapYearChecker inputYear = new leapYearChecker();

        int year = 1600; //delbart med 400

        boolean actual = inputYear.isLeapYear(year);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}
