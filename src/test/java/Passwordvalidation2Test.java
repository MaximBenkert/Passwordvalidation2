import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Passwordvalidation2Test {

    @Test
    void shouldReturnTrueIfPasswordLongerThan7 (){
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
        String password = "la99jsl";
        //when
        boolean actual = Passwordvalidation2.passwordLength(password);
        //then
        assertEquals(false, actual);

    }

    @Test
    void shouldReturnTrueifPasswordContainsDigit (){
        //given
        String password = "123";
        //when
        boolean actual = Passwordvalidation2.containsDigit(password);
        //then
        assertEquals(true, actual);
    }

    @Test
    void shouldReturnFalseifPasswordDoesNotContainDigit (){
        //given
        String password = "adsfkj";
        //when
        boolean actual = Passwordvalidation2.containsDigit(password);
        //then
        assertEquals(false, actual);
    }

}

