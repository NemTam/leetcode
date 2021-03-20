package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    @Test
    void romanNumbers() {
        assertEquals(4, RomanNumbers.romanToInt("IV"));
        assertEquals(5, RomanNumbers.romanToInt("V"));
        assertEquals(2349, RomanNumbers.romanToInt("MMCCCXLIX"));
        assertEquals(3500, RomanNumbers.romanToInt("MMMD"));
    }

}