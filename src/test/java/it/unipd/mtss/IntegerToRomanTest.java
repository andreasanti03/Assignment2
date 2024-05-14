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
}
