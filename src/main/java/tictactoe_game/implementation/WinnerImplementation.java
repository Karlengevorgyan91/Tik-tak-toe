package tictactoe_game.implementation;

import java.util.ArrayList;
import java.util.List;

import tictactoe_game.model.types.*;
import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class WinnerImplementation {
    public static Boolean is_there_a_winner(Grid grid){
        var rows = getGridRows(grid);
        var columns = getGridColumns(grid);
        var mainDiagonal = getGridMainDiagonal(grid);
        var secondaryDiagonal = getGridSecondaryDiagonal(grid);
        List<List<Element>> list = new ArrayList<List<Element>>();
        
        list.addAll(rows);
        list.addAll(columns);
        list.addAll(mainDiagonal);
        list.addAll(secondaryDiagonal);

        for (List<Element> elementsList : list) {
            if (are_the_elements_of_the_list_the_same(elementsList)){
                return true;
            }
        }

        return false;
    }

    public static Boolean are_the_elements_of_the_list_the_same(List<?> list){
        if (list.isEmpty()){
            return false;
        }

        return list.stream().allMatch(element->element.equals(list.get(0)));
    }

    public static Rows getGridRows(Grid grid){
        var rows = new Rows();

        for (int i = 0; i < grid.grid.length; i++) {
            var row = new ArrayList<Element>();

            for(int j = 0; j < grid.grid[i].length; j++){
                row.add(grid.grid[i][j]);
            }

            rows.add(row);
        }

        return rows;
    }

    public static Columns getGridColumns(Grid grid){
        var columns = new Columns();

        for (int i = 0; i < grid.grid.length; i++){
            var column = new ArrayList<Element>();

            for (int j = 0; j< grid.grid[i].length; j++){
                column.add(grid.grid[j][i]);
            }

            columns.add(column);
        }

        return columns;
    }

    public static Diagonals getGridMainDiagonal(Grid grid){
        var diagonals = new Diagonals();
        var diagonal = new ArrayList<Element>();

        for (int i = 0; i < grid.grid.length; i++){
            for (int j = 0; j < grid.grid[i].length; j++){
                if (i == j) {
                    diagonal.add(grid.grid[i][j]);
                }
            }
        }
        diagonals.add(diagonal);

        return diagonals;
    }

    public static Diagonals getGridSecondaryDiagonal(Grid grid){
        var diagonals = new Diagonals();
        var diagonal = new ArrayList<Element>();

        for (int i = 0; i < grid.grid.length; i++){
            for (int j = 0; j < grid.grid[i].length; j++){
                if (i + j == grid.grid.length-1) {
                    diagonal.add(grid.grid[i][j]);
                }
            }
        }
        diagonals.add(diagonal);

        return diagonals;
    }
}
