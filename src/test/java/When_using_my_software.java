import no.thomasj.leapYear.leapYear;
import org.junit.jupiter.api.*;

public class When_using_my_software {

    @Test
    public void i_get_a_nice_message(){
        leapYear sut = new leapYear();
        String actual = sut.message();
        Assertions.assertEquals("Hello",actual);
    }
}
