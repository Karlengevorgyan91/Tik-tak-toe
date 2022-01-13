package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tictactoe_game.model.Element.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tictactoe_game.implementation.DrawImplementation;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class DrawImplementationTest {

    @Test
    @DisplayName("Must be draw, when grid is filled, and no other winner")
    public void must_be_draw(){
    Element[][] emptyGrid = { { X, O, X }, { X, X, O }, { O, X, O } };
    Grid newGrid = new Grid(emptyGrid);

    assertTrue(DrawImplementation.gameOverWithDraw(newGrid));
    }

    @Test
    @DisplayName("The game is not over, if grid contains empty cell")
    public void the_game_is_not_over(){
    Element[][] emptyGrid = { { X, O, EMPTY }, { X, X, O }, { O, X, O } };
    Grid newGrid = new Grid(emptyGrid);

    assertFalse(DrawImplementation.gameOverWithDraw(newGrid));
    }
    
}
