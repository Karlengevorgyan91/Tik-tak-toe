package tictactoe_game.model;

public class Grid {
    public String[][] grid;

    public Grid(String[][] grid) {
        this.grid = grid;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Grid)) {
            return false;
        }

        Grid other = (Grid) obj;
        boolean currencyCodeEquals = (this.grid == null && other.grid == null)
                || (this.grid != null && this.grid.equals(other.grid));
        return currencyCodeEquals;
    }

}
