package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tictactoe_game.model.Coordinate;
import tictactoe_game.model.Grid;

public class CellEmptyTest {
  @Test
  @DisplayName("Check that the cell on coordinate '0,0' is empty")
  public void cell_must_be_empty_on_coordinate_0_0() {
    Coordinate coord = new Coordinate(0, 0);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '0,1' is empty")
  public void cell_must_be_empty_on_coordinate_0_1() {
    Coordinate coord = new Coordinate(0, 1);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '0,2' is empty")
  public void cell_must_be_empty_on_coordinate_0_2() {
    Coordinate coord = new Coordinate(0, 2);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '1,0' is empty")
  public void cell_must_be_empty_on_coordinate_1_0() {
    Coordinate coord = new Coordinate(1, 0);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '1,1' is empty")
  public void cell_must_be_empty_on_coordinate_1_1() {
    Coordinate coord = new Coordinate(1, 1);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '1,2' is empty")
  public void cell_must_be_empty_on_coordinate_1_2() {
    Coordinate coord = new Coordinate(0, 0);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '2,0' is empty")
  public void cell_must_be_empty_on_coordinate_2_0() {
    Coordinate coord = new Coordinate(2, 0);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '2,1' is empty")
  public void cell_must_be_empty_on_coordinate_2_1() {
    Coordinate coord = new Coordinate(2, 1);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }

  @Test
  @DisplayName("Check that the cell on coordinate '2,2' is empty")
  public void cell_must_be_empty_on_coordinate_2_2() {
    Coordinate coord = new Coordinate(2, 2);
    Grid emptyGrid = Grid.emptyGrid();

    assertTrue(Main.cell_is_empty(emptyGrid, coord));
  }
}
