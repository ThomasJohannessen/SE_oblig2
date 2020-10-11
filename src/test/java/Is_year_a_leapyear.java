import no.thomasj.leapYear.leapYearChecker;
import org.junit.jupiter.api.*;

public class Is_year_a_leapyear {
    @Test
    public void is_the_logic_correct_for_random_year() {
        leapYearChecker inputYear = new leapYearChecker();

        int randomYear = 3654; //år 3654 er kontrollert, og er ikke et skuddår

        boolean actual = inputYear.isLeapYear(randomYear);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void is_a_year_devided_by_four_but_not_100_a_leapyear() {
        leapYearChecker inputYear = new leapYearChecker();

        int year = 2255; //ikke delbart på 100 eller 4

        boolean actual = inputYear.isLeapYear(year);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
/*
    @Test
    public void is_the_logic_correct_for_random_year() {
        leapYearChecker inputYear = new leapYearChecker();

        int randomYear = 3654; //år 3654 er kontrollert, og er ikke et skuddår

        boolean actual = inputYear.isLeapYear(randomYear);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void is_the_logic_correct_for_random_year() {
        leapYearChecker inputYear = new leapYearChecker();

        int randomYear = 3654; //år 3654 er kontrollert, og er ikke et skuddår

        boolean actual = inputYear.isLeapYear(randomYear);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void is_the_logic_correct_for_random_year() {
        leapYearChecker inputYear = new leapYearChecker();

        int randomYear = 3654; //år 3654 er kontrollert, og er ikke et skuddår

        boolean actual = inputYear.isLeapYear(randomYear);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    */
}
