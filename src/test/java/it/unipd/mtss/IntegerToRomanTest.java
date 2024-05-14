////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void evaluatePrimiTre(){
        String variabileOne = "I";
        String variabileTwo = "II";
        String variabileThree = "III";
        assertEquals(variabileOne, IntegerToRoman.convert(1));
        assertEquals(variabileTwo, IntegerToRoman.convert(2));
        assertEquals(variabileThree, IntegerToRoman.convert(3));
    }

    @Test
    public void evalutePrimiSei(){
        String variabileFour = "IV";
        String variabileFive = "V";
        String variabileSix = "VI";
        assertEquals(variabileFour, IntegerToRoman.convert(4));
        assertEquals(variabileFive, IntegerToRoman.convert(5));
        assertEquals(variabileSix, IntegerToRoman.convert(6));
    }
}
