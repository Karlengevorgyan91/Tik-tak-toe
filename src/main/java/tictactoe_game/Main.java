package tictactoe_game;

import tictactoe_game.model.Coordinate;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class Main {
  public static Grid put(Element element, Grid grid, Coordinate coordinate) {
    Element putElement = element;
    Integer x = coordinate.x;
    Integer y = coordinate.y;

    grid.grid[x][y] = putElement;

    return grid;
  }

  public static Boolean cell_is_empty(Grid grid, Coordinate coordinate) {
    Integer x = coordinate.x;
    Integer y = coordinate.y;

    if (grid.grid[x][y].equals(Element.EMPTY)) {

      return true;
    }

    return false;
  }
}
