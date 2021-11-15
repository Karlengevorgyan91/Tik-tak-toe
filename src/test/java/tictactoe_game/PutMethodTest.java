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
public class PutMethodTest {

    /**
     * Tests for 'X' element's
     */

    @Test
    @DisplayName("Check 'X' element's position on coordinate '0,0'")
    public void put_x_returns_grid00() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "X", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '0,1'")
    public void put_x_returns_grid01() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "X", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '0,2'")
    public void put_x_returns_grid02() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "X" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '1,0'")
    public void put_x_returns_grid10() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "X", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '1,1'")
    public void put_x_returns_grid11() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "X", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '1,2'")
    public void put_x_returns_grid12() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "X" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '2,0'")
    public void put_x_returns_grid20() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "X", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '2,1'")
    public void put_x_returns_grid21() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "X", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '2,2'")
    public void put_x_returns_grid22() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "X" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.X, grid1), grid2);
    }

    /**
     * Tests for 'O' element's
     */

    @Test
    @DisplayName("Check 'O' element's position on coordinate '0,0'")
    public void put_o_returns_grid00() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "O", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '0,1'")
    public void put_o_returns_grid01() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "O", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '0,2'")
    public void put_o_returns_grid02() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "O" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '1,0'")
    public void put_o_returns_grid10() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "O", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '1,1'")
    public void put_o_returns_grid11() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "O", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '1,2'")
    public void put_o_returns_grid12() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "O" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '2,0'")
    public void put_o_returns_grid20() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "O", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '2,1'")
    public void put_o_returns_grid21() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "O", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '2,2'")
    public void put_o_returns_grid22() {
        Player player1 = new Player("Player1");
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "O" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };

        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(player1, Element.O, grid1), grid2);
    }

}
