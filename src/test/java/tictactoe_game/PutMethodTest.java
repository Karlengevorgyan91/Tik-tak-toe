package tictactoe_game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tictactoe_game.model.Coordinate;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class PutMethodTest {
    @Test
    @DisplayName("Check 'X' element's position on coordinate '0,0'")
    public void put_x_returns_grid00() {
        Coordinate coord = new Coordinate(0, 0);
        String[][] newGrid = { { "X", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '0,1'")
    public void put_x_returns_grid01() {
        Coordinate coord = new Coordinate(0, 1);
        String[][] newGrid = { { "EMPTY", "X", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '0,2'")
    public void put_x_returns_grid02() {
        Coordinate coord = new Coordinate(0, 2);
        String[][] newGrid = { { "EMPTY", "EMPTY", "X" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '1,0'")
    public void put_x_returns_grid10() {
        Coordinate coord = new Coordinate(1, 0);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "X", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '1,1'")
    public void put_x_returns_grid11() {
        Coordinate coord = new Coordinate(1, 1);

        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "X", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '1,2'")
    public void put_x_returns_grid12() {
        Coordinate coord = new Coordinate(1, 2);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "X" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '2,0'")
    public void put_x_returns_grid20() {
        Coordinate coord = new Coordinate(2, 0);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "X", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '2,1'")
    public void put_x_returns_grid21() {
        Coordinate coord = new Coordinate(2, 1);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "X", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'X' element's position on coordinate '2,2'")
    public void put_x_returns_grid22() {
        Coordinate coord = new Coordinate(2, 2);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "X" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.X, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '0,0'")
    public void put_o_returns_grid00() {
        Coordinate coord = new Coordinate(0, 0);
        String[][] newGrid = { { "O", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '0,1'")
    public void put_o_returns_grid01() {
        Coordinate coord = new Coordinate(0, 1);
        String[][] newGrid = { { "EMPTY", "O", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '0,2'")
    public void put_o_returns_grid02() {
        Coordinate coord = new Coordinate(0, 2);
        String[][] newGrid = { { "EMPTY", "EMPTY", "O" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '1,0'")
    public void put_o_returns_grid10() {
        Coordinate coord = new Coordinate(1, 0);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "O", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '1,1'")
    public void put_o_returns_grid11() {
        Coordinate coord = new Coordinate(1, 1);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "O", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '1,2'")
    public void put_o_returns_grid12() {
        Coordinate coord = new Coordinate(1, 2);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "O" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '2,0'")
    public void put_o_returns_grid20() {
        Coordinate coord = new Coordinate(2, 0);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "O", "EMPTY", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '2,1'")
    public void put_o_returns_grid21() {   
        Coordinate coord = new Coordinate(2, 1);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "O", "EMPTY" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }

    @Test
    @DisplayName("Check 'O' element's position on coordinate '2,2'")
    public void put_o_returns_grid22() {
        Coordinate coord = new Coordinate(2, 2);
        String[][] newGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "O" } };
        String[][] oldGrid = { { "EMPTY", "EMPTY", "EMPTY" }, { "EMPTY", "EMPTY", "EMPTY" },
                { "EMPTY", "EMPTY", "EMPTY" } };
        Grid grid1 = new Grid(oldGrid);
        Grid grid2 = new Grid(newGrid);

        assertEquals(Main.put(Element.O, grid1, coord), grid2);
    }
}
