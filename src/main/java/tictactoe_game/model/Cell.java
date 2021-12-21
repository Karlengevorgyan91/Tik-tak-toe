package tictactoe_game.model;

public class Cell {
    public final Coordinate cellCoordinate;
    public final Element element;

    public Cell(Coordinate cellcoordinate, Element element) {
        this.cellCoordinate = cellcoordinate;
        this.element = element;
    }
}
