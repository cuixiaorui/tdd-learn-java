package com.company;

public class PawnTest extends junit.framework.TestCase {

    public void testCreated(){
        final String firstPawnColor = "white";
        Pawn firstPawn = new Pawn(firstPawnColor);
        assertEquals(firstPawnColor,firstPawn.getColor());

        final String secondPawnColor = "black";
        Pawn secondPawn = new Pawn(secondPawnColor);
        assertEquals(secondPawnColor,secondPawn.getColor());
    }
}
