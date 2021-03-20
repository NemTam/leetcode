package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParanthesesTest {

    @Test
    void isValid() {
        assertEquals(true, ValidParantheses.isValid("()"));
        assertEquals(true, ValidParantheses.isValid("()[]"));
        assertEquals(true, ValidParantheses.isValid("(){}"));
        assertEquals(true, ValidParantheses.isValid("[(){}]"));
        assertEquals(true, ValidParantheses.isValid("[({})]"));
    }

    @Test
    void isNotValid() {
        assertEquals(false, ValidParantheses.isValid("("));
        assertEquals(false, ValidParantheses.isValid("()]"));
        assertEquals(false, ValidParantheses.isValid("({}"));
        assertEquals(false, ValidParantheses.isValid("(){}]"));
        assertEquals(false, ValidParantheses.isValid("[({)"));
    }
}