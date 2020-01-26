package chess;

public class PawnTest extends junit.framework.TestCase {

    public void testCreated() {
        Pawn firstPawn = new Pawn(Pawn.COLOR_WHITE);
        assertEquals(Pawn.COLOR_WHITE, firstPawn.getColor());


        Pawn defaultPawn = new Pawn();
        assertEquals(Pawn.COLOR_WHITE, defaultPawn.getColor());

        Pawn secondPawn = new Pawn(Pawn.COLOR_BLACK);
        assertEquals(Pawn.COLOR_BLACK, secondPawn.getColor());

    }
}
