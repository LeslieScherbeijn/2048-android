package com.uberspot.a2048;

import org.junit.Test;
import static org.junit.Assert.*;

public class FietsTest {

    @org.junit.Test
    public void setHeefttweewielen() {
        Fiets fiets = new Fiets(true);
        fiets.setHeefttweewielen(false);
        assertEquals(false , fiets.isHeefttweewielen());
    }

    @org.junit.Test
    public void isHeefttweewielen() {
    }
}