package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tictactoe_game.model.Element.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tictactoe_game.implementation.WinnerImplementation;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;
import tictactoe_game.model.types.*;

public class WinnerTest {
  @Test
  @DisplayName("Must win on first row by element `X`")
  public void must_win_on_first_row_by_x() {
    Element[][] winGrid = { { X, X, X }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid newGrid = new Grid(winGrid);

    assertTrue(WinnerImplementation.is_there_a_winner(newGrid));
  }

  @Test
  @DisplayName("Must win on first column by element `X`")
  public void must_win_on_first_column_by_x() {
    Element[][] winGrid = { { X, EMPTY, EMPTY }, { X, EMPTY, EMPTY }, { X, EMPTY, EMPTY } };
    Grid newGrid = new Grid(winGrid);

    assertTrue(WinnerImplementation.is_there_a_winner(newGrid));
  }

  @Test
  @DisplayName("Must win on diagonal by element `X`")
  public void must_win_on_diagonal_by_x() {
    Element[][] winGrid = { { X, EMPTY, EMPTY }, { EMPTY, X, EMPTY }, { EMPTY, EMPTY, X } };
    Grid newGrid = new Grid(winGrid);

    assertTrue(WinnerImplementation.is_there_a_winner(newGrid));
  }

  @Test
  @DisplayName("Must win on first row by element `O`")
  public void must_win_on_first_row_by_o() {
    Element[][] winGrid = { { O, O, O }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };
    Grid newGrid = new Grid(winGrid);

    assertTrue(WinnerImplementation.is_there_a_winner(newGrid));
  }

  @Test
  @DisplayName("Must win on first column by element `O`")
  public void must_win_on_first_column_by_o() {
    Element[][] winGrid = { { O, EMPTY, EMPTY }, { O, EMPTY, EMPTY }, { O, EMPTY, EMPTY } };
    Grid newGrid = new Grid(winGrid);

    assertTrue(WinnerImplementation.is_there_a_winner(newGrid));
  }

  @Test
  @DisplayName("Must win on diagonal by element `O`")
  public void must_win_on_diagonal_by_o() {
    Element[][] winGrid = { { O, EMPTY, EMPTY }, { EMPTY, O, EMPTY }, { EMPTY, EMPTY, O } };
    Grid newGrid = new Grid(winGrid);

    assertTrue(WinnerImplementation.is_there_a_winner(newGrid));
  }

  @Test
  @DisplayName("Must return true, when elements in the list are same")
  public void must_return_true_when_elements_are_same() {
    var list = List.of(1, 1, 1);

    assertTrue(WinnerImplementation.are_the_elements_of_the_list_the_same(list));
  }

  @Test
  @DisplayName("Must return false, when elements in the list are different")
  public void must_return_false_when_elements_are_different() {
    var list = List.of(1, 2, 4);

    assertFalse(WinnerImplementation.are_the_elements_of_the_list_the_same(list));
  }

  @Test
  @DisplayName("Must return false, when the list is empty")
  public void must_return_false_when_list_empty() {
    var list = List.of();

    assertFalse(WinnerImplementation.are_the_elements_of_the_list_the_same(list));
  }

  @Test
  @DisplayName("Must return true, when `elements` in the list are `X`")
  public void must_return_true_when_elements_are_x() {
    var list = List.of(X, X, X);

    assertTrue(WinnerImplementation.are_the_elements_of_the_list_the_same(list));
  }

  @Test
  @DisplayName("Must return true, when `elements` in the list are `O`")
  public void must_return_true_when_elements_are_o() {
    var list = List.of(O, O, O);

    assertTrue(WinnerImplementation.are_the_elements_of_the_list_the_same(list));
  }

  @Test
  @DisplayName("Must return false, when `elements` in the list different")
  public void must_return_false_when_elements_not_same() {
    var list = List.of(X, O, X);

    assertFalse(WinnerImplementation.are_the_elements_of_the_list_the_same(list));
  }

  @Test
  @DisplayName("Must return a list of rows from the grid")
  public void must_return_a_list_of_rows_from_the_grid(){
    Element[][] elementsList = { {X,EMPTY,O}, {O,O,X}, {EMPTY,X,EMPTY} };
    Grid existingGrid = new Grid(elementsList);
    
    var rows = new Rows();
    rows.add(List.of(X,EMPTY,O));
    rows.add(List.of(O,O,X));
    rows.add(List.of(EMPTY,X,EMPTY));
    
    assertArrayEquals(rows.toArray(), WinnerImplementation.getGridRows(existingGrid).toArray());
  }

  @Test
  @DisplayName("Must return a list of columns from the grid")
  public void must_return_a_list_of_columns_from_the_grid(){
    Element[][] elementsList = { {X,EMPTY,O}, {O,O,X}, {EMPTY,X,EMPTY} };
    Grid existingGrid = new Grid(elementsList);
    
    var columns = new Columns();
    columns.add(List.of(X,O,EMPTY));
    columns.add(List.of(EMPTY,O,X));
    columns.add(List.of(O,X,EMPTY));
    
    assertArrayEquals(columns.toArray(), WinnerImplementation.getGridColumns(existingGrid).toArray());
  }

  @Test
  @DisplayName("Must return a main diagonal of the grid")
  public void must_return_a_main_diagonal_of_the_grid(){
    Element[][] elementsList = { {X,EMPTY,O}, {O,O,X}, {EMPTY,X,EMPTY} };
    Grid existingGrid = new Grid(elementsList);
    
    var mainDiagonal = new Diagonals();
    mainDiagonal.add(List.of(X,O,EMPTY));
    
    assertArrayEquals(mainDiagonal.toArray(), WinnerImplementation.getGridMainDiagonal(existingGrid).toArray());
  }

  @Test
  @DisplayName("Must return a secondary diagonal of the grid")
  public void must_return_a_secondary_diagonal_of_the_grid(){
    Element[][] elementsList = { {X,EMPTY,O}, {O,O,X}, {EMPTY,X,EMPTY} };
    Grid existingGrid = new Grid(elementsList);
    
    var secondaryDiagonal = new Diagonals();
    secondaryDiagonal.add(List.of(O,O,EMPTY));
    
    assertArrayEquals(secondaryDiagonal.toArray(), WinnerImplementation.getGridSecondaryDiagonal(existingGrid).toArray());
  }
}
