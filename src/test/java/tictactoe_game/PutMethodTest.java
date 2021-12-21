package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tictactoe_game.model.Element.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tictactoe_game.implementation.PutImplementation;
import tictactoe_game.model.Coordinate;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class PutMethodTest {
  @Test
  @DisplayName("Check that the method `emptyGrid` returned EMPTY elements")
  public void array_elements_must_be_empty() {

    Element[][] emptyGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };

    Grid newGrid = new Grid(emptyGrid);

    assertEquals(Grid.emptyGrid(), newGrid);
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '0,0' after we `put` it on grid")
  public void must_be_x_on_coordinate_0_0() {
    Coordinate coord = new Coordinate(0, 0);
    Element[][] newGrid = { { X, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '0,1' after we `put` it on grid")
  public void must_be_x_on_coordinate_0_1() {
    Coordinate coord = new Coordinate(0, 1);
    Element[][] newGrid = { { EMPTY, X, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '0,2' after we `put` it on grid")
  public void must_be_x_on_coordinate_0_2() {
    Coordinate coord = new Coordinate(0, 2);
    Element[][] newGrid = { { EMPTY, EMPTY, X }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '1,0' after we `put` it on grid")
  public void must_be_x_on_coordinate_1_0() {
    Coordinate coord = new Coordinate(1, 0);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { X, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '1,1' after we `put` it on grid")
  public void must_be_x_on_coordinate_1_1() {
    Coordinate coord = new Coordinate(1, 1);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, X, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '1,2' after we `put` it on grid")
  public void must_be_x_on_coordinate_1_2() {
    Coordinate coord = new Coordinate(1, 2);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, X }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '2,0' after we `put` it on grid")
  public void must_be_x_on_coordinate_2_0() {
    Coordinate coord = new Coordinate(2, 0);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { X, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '2,1' after we `put` it on grid")
  public void must_be_x_on_coordinate_2_1() {
    Coordinate coord = new Coordinate(2, 1);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, X, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'X' is on coordinate '2,2' after we `put` it on grid")
  public void must_be_x_on_coordinate_2_2() {
    Coordinate coord = new Coordinate(2, 2);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, X } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.X, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '0,0' after we `put` it on grid")
  public void must_be_o_on_coordinate_0_0() {
    Coordinate coord = new Coordinate(0, 0);
    Element[][] newGrid = { { O, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '0,1' after we `put` it on grid")
  public void must_be_o_on_coordinate_0_1() {
    Coordinate coord = new Coordinate(0, 1);
    Element[][] newGrid = { { EMPTY, O, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '0,2' after we `put` it on grid")
  public void must_be_o_on_coordinate_0_2() {
    Coordinate coord = new Coordinate(0, 2);
    Element[][] newGrid = { { EMPTY, EMPTY, O }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '1,0' after we `put` it on grid")
  public void must_be_o_on_coordinate_1_0() {
    Coordinate coord = new Coordinate(1, 0);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { O, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '1,1' after we `put` it on grid")
  public void must_be_o_on_coordinate_1_1() {
    Coordinate coord = new Coordinate(1, 1);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, O, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '1,2' after we `put` it on grid")
  public void must_be_o_on_coordinate_1_2() {
    Coordinate coord = new Coordinate(1, 2);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, O }, { EMPTY, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '2,0' after we `put` it on grid")
  public void must_be_o_on_coordinate_2_0() {
    Coordinate coord = new Coordinate(2, 0);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { O, EMPTY, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '2,1' after we `put` it on grid")
  public void must_be_o_on_coordinate_2_1() {
    Coordinate coord = new Coordinate(2, 1);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, O, EMPTY } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }

  @Test
  @DisplayName("Check if 'O' is on coordinate '2,2' after we `put` it on grid")
  public void must_be_o_on_coordinate_2_2() {
    Coordinate coord = new Coordinate(2, 2);
    Element[][] newGrid = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, O } };
    Grid emptyGrid = Grid.emptyGrid();
    Grid expectGrid = new Grid(newGrid);

    assertEquals(expectGrid, PutImplementation.put(Element.O, emptyGrid, coord));
  }
}
