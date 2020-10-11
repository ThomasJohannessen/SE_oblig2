import no.thomasj.leapYear.leapYearChecker;
import org.junit.jupiter.api.*;
import java.io.IOException;



public class When_input_year {
    @Test
    public void the_year_is_stored_as_int_in_variable() {
        String input_arstall = "2020";
        int actual = Integer.parseInt(input_arstall);
        int expected = 2020;
        Assertions.assertEquals(expected, actual);
    }
}
