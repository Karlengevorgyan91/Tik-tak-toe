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
}
