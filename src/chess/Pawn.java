package chess;

public class Pawn {
    private String color;

    public static String COLOR_WHITE = "white";
    public static String COLOR_BLACK = "black";
    public Pawn(String color) {
        this.color = color;
    }

    public Pawn(){
        this.color = Pawn.COLOR_WHITE;
    }

    public String getColor() {
        return this.color;
    }
}
