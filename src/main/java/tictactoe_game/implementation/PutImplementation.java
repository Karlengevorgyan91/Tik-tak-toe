package tictactoe_game.implementation;

import tictactoe_game.model.Cell;
import tictactoe_game.model.Coordinate;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class PutImplementation {
    public static Grid put(Element element, Grid grid, Coordinate coordinate) {
        Element putElement = element;
        Integer x = coordinate.x;
        Integer y = coordinate.y;

        grid.grid[x][y] = putElement;

        return grid;
    }

    public static Boolean is_the_cell_empty(Cell cell) {
        return cell.element.equals(Element.EMPTY);
    }
}
