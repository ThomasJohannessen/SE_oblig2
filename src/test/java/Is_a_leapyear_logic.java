import no.thomasj.leapYear.leapYearChecker;
import org.junit.jupiter.api.*;

public class Is_a_leapyear_logic {
    @Test
    public void is_the_logic_correct_for_random_year() {
        leapYearChecker inputYear = new leapYearChecker();

        //int randomYear = 3654; //år 3654 er kontrollert, og er ikke et skuddår
int randomYear = 2000;
        boolean actual = inputYear.isLeapYear(randomYear);
        //boolean expected = false;
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}
