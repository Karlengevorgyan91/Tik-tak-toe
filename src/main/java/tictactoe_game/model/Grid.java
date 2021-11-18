package tictactoe_game.model;

import java.util.Arrays;

public class Grid {
    public final String[][] grid;

    public Grid(String[][] grid) {
        this.grid = grid;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
            
        if (!(o instanceof Grid)) {
            return false;
        }

        Grid grid = (Grid) o;

        Boolean check = (this.grid == null && grid.grid == null)
                || (this.grid != null && Arrays.deepEquals(this.grid, grid.grid));

        return check;
    }
}
