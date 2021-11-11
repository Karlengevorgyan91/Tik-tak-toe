package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;
import tictactoe_game.model.Player;

/**
 * Unit test for simple App.
 */
public class PutMethodTest 
{
    /**
     * Tests for 'X' element's
     */

    @Test
    @DisplayName("Check 'X' element's position on coordinate '0,0'")
    public void put_x_returns_grid00(){
        Player player1 = new Player("Player1");
        String [][] newGrid = {{"X", "EMPTY", "EMPTY"}, {"EMPTY", "EMPTY", "EMPTY"}, {"EMPTY", "EMPTY", "EMPTY"}};
        String [][] oldGrid = {{"EMPTY", "EMPTY", "EMPTY"}, {"EMPTY", "EMPTY", "EMPTY"}, {"EMPTY", "EMPTY", "EMPTY"}};
        
        Grid grid1 = new Grid(newGrid);
        Grid grid2 = new Grid(oldGrid);
        
        assertEquals(grid1, Main.put(player1, Element.X, grid2));
    }
}
