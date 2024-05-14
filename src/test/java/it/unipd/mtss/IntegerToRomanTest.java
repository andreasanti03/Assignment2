////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void evalutePrimiCinquanta(){
        String variabileTwentuOne = "XXI";
        String variabileTwentyNine = "XXIX";
        String variabileThirtyFour = "XXXIV";
        String variabileThirtySix = "XXXVI";
        String variabileFourty = "XL";
        String variabileFourtyFive = "XLV";
        String variabileFourtyNine = "XLIX";
        String variabileFifty = "L";
        assertEquals(variabileTwentuOne, IntegerToRoman.convert(21));
        assertEquals(variabileTwentyNine, IntegerToRoman.convert(29));
        assertEquals(variabileThirtyFour, IntegerToRoman.convert(34));
        assertEquals(variabileThirtySix, IntegerToRoman.convert(36));
        assertEquals(variabileFourty, IntegerToRoman.convert(40));
        assertEquals(variabileFourtyFive, IntegerToRoman.convert(45));
        assertEquals(variabileFourtyNine, IntegerToRoman.convert(49));
        assertEquals(variabileFifty, IntegerToRoman.convert(50));
    }
    @Test
    public void evalutePrimiCento(){
        assertEquals("LI", IntegerToRoman.convert(51));
        assertEquals("LV", IntegerToRoman.convert(55));
        assertEquals("LXII", IntegerToRoman.convert(62));
        assertEquals("LXVII", IntegerToRoman.convert(67));
        assertEquals("LXXIII", IntegerToRoman.convert(73));
        assertEquals("LXXVI", IntegerToRoman.convert(76));
        assertEquals("LXXXIV", IntegerToRoman.convert(84));
        assertEquals("LXXXVIII", IntegerToRoman.convert(88));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
    }

}
