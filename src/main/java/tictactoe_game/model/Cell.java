package tictactoe_game.model;

public class Cell {
    public final Coordinate cellCoordinate;
    public final Element cellElement;

    public Cell(Coordinate cellcoordinate, Element cellelement) {
        this.cellCoordinate = cellcoordinate;
        this.cellElement = cellelement;
    }
}
