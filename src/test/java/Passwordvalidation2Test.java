import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Passwordvalidation2Test {

    @Test
    void shouldReturnTrueIfPasswordLongerThan8 (){
        //given
        String password = "12345678";
        //when
        boolean actual = Passwordvalidation2.passwordLength(password);
        //then
        assertEquals(true, actual);

    }
    @Test
    void shouldReturnFalseIfPasswordShorterThan8 (){
        //given
        String password = "lajsl";
        //when
        boolean actual = Passwordvalidation2.passwordLength(password);
        //then
        assertEquals(false, actual);

}}
