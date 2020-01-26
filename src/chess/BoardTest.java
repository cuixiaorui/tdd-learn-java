package chess;

import junit.framework.TestCase;

public class BoardTest extends TestCase {


    private Board board;
    public void setUp() throws Exception {
        super.setUp();
        this.board = new Board();
    }

    public void testCreated(){
        assertEquals(board.isEmpty(),true);
    }


    public void testAddPawn(){
        Pawn firstPawn = new Pawn();
        board.addPawn(firstPawn);

        assertEquals(1,board.getNumberOfPieces());
        assertEquals(firstPawn,board.getPiece(0)); ;

        Pawn secondPwan = new Pawn(Pawn.COLOR_BLACK);
        board.addPawn(secondPwan);

        assertEquals(2,board.getNumberOfPieces());
        assertEquals(firstPawn,board.getPiece(0)); ;
        assertEquals(secondPwan,board.getPiece(1)); ;
    }
}
