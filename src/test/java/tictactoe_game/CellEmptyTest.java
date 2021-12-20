package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tictactoe_game.implementation.PutImplementation;
import tictactoe_game.model.Cell;
import tictactoe_game.model.Coordinate;
import tictactoe_game.model.Element;

public class CellEmptyTest {
  @Test
  @DisplayName("The cell on coordinate '0,0' must be empty")
  public void cell_must_be_empty_on_coordinate_0_0() {
    Cell cell = new Cell(new Coordinate(0, 0), Element.EMPTY);

    assertTrue(PutImplementation.is_the_cell_empty(cell));
  }

  @Test
  @DisplayName("The cell on coordinate '0,0' must be `X`")
  public void cell_must_be_x_on_coordinate_0_0() {
    Cell cell = new Cell(new Coordinate(0, 0), Element.X);

    assertFalse(PutImplementation.is_the_cell_empty(cell));
  }

  @Test
  @DisplayName("The cell on coordinate '0,0' must be `O`")
  public void cell_must_be_o_on_coordinate_0_0() {
    Cell cell = new Cell(new Coordinate(0, 0), Element.O);

    assertFalse(PutImplementation.is_the_cell_empty(cell));
  }
}
