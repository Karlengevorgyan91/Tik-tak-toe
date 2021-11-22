package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tictactoe_game.model.Coordinate;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class PutMethodTest {
  @Test
  @DisplayName("Check that the method `emptyGrid` returned 'EMPTY' elements")
  public void array_elements_must_be_empty() {
    String[][] emptyArray = new String[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        emptyArray[i][j] = Element.EMPTY.name();
      }
    }

    assertArrayEquals(Grid.createEmpatyArray(), emptyArray);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '0,0' after we `put` it on grid")
  public void must_be_x_on_coordinate_0_0() {
    Coordinate coord = new Coordinate(0, 0);
    String[][] newGrid = { { "X", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '0,1' after we `put` it on grid")
  public void must_be_x_on_coordinate_0_1() {
    Coordinate coord = new Coordinate(0, 1);
    String[][] newGrid = { { "EMPTY", "X", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '0,2' after we `put` it on grid")
  public void must_be_x_on_coordinate_0_2() {
    Coordinate coord = new Coordinate(0, 2);
    String[][] newGrid = { { "EMPTY", "EMPTY", "X" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '1,0' after we `put` it on grid")
  public void must_be_x_on_coordinate_1_0() {
    Coordinate coord = new Coordinate(1, 0);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "X", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '1,1' after we `put` it on grid")
  public void must_be_x_on_coordinate_1_1() {
    Coordinate coord = new Coordinate(1, 1);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "X", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '1,2' after we `put` it on grid")
  public void must_be_x_on_coordinate_1_2() {
    Coordinate coord = new Coordinate(1, 2);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "X" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '2,0' after we `put` it on grid")
  public void must_be_x_on_coordinate_2_0() {
    Coordinate coord = new Coordinate(2, 0);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "X", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '2,1' after we `put` it on grid")
  public void must_be_x_on_coordinate_2_1() {
    Coordinate coord = new Coordinate(2, 1);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "X", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '2,2' after we `put` it on grid")
  public void must_be_x_on_coordinate_2_2() {
    Coordinate coord = new Coordinate(2, 2);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "X" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.X, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '0,0' after we `put` it on grid")
  public void must_be_o_on_coordinate_0_0() {
    Coordinate coord = new Coordinate(0, 0);
    String[][] newGrid = { { "O", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '0,1' after we `put` it on grid")
  public void must_be_o_on_coordinate_0_1() {
    Coordinate coord = new Coordinate(0, 1);
    String[][] newGrid = { { "EMPTY", "O", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '0,2' after we `put` it on grid")
  public void must_be_o_on_coordinate_0_2() {
    Coordinate coord = new Coordinate(0, 2);
    String[][] newGrid = { { "EMPTY", "EMPTY", "O" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '1,0' after we `put` it on grid")
  public void must_be_o_on_coordinate_1_0() {
    Coordinate coord = new Coordinate(1, 0);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "O", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '1,1' after we `put` it on grid")
  public void must_be_o_on_coordinate_1_1() {
    Coordinate coord = new Coordinate(1, 1);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "O", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '1,2' after we `put` it on grid")
  public void must_be_o_on_coordinate_1_2() {
    Coordinate coord = new Coordinate(1, 2);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "O" }, { "EMPTY", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '2,0' after we `put` it on grid")
  public void must_be_o_on_coordinate_2_0() {
    Coordinate coord = new Coordinate(2, 0);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "O", "EMPTY", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '2,1' after we `put` it on grid")
  public void must_be_o_on_coordinate_2_1() {
    Coordinate coord = new Coordinate(2, 1);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "O", "EMPTY" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '2,2' after we `put` it on grid")
  public void must_be_o_on_coordinate_2_2() {
    Coordinate coord = new Coordinate(2, 2);
    String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "O" } };
    String[][] oldGrid = Grid.createEmpatyArray();
    Grid grid1 = new Grid(oldGrid);
    Grid grid2 = new Grid(newGrid);

    assertEquals(Main.put(Element.O, grid1, coord), grid2);
  }
}
