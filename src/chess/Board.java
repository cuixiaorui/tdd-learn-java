package chess;

import java.util.ArrayList;

public class Board {
    private ArrayList<Pawn> pieceList;

    public Board(){
        this.pieceList = new ArrayList<Pawn>();
    }
    public boolean isEmpty() {
        return pieceList.isEmpty();
    }

    public void addPawn(Pawn pawn) {
        pieceList.add(pawn);
    }


    public int getNumberOfPieces() {
        return pieceList.size();
    }

    public Pawn getPiece(int index) {
        return pieceList.get(index);
    }
}
