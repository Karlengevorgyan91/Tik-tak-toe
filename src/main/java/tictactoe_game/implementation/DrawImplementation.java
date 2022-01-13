package tictactoe_game.implementation;

import java.util.Arrays;

import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class DrawImplementation{

    public static Boolean gameOverWithDraw(Grid grid){
        for (Element[] elements : grid.grid) {

            if (Arrays.asList(elements).contains(Element.EMPTY)){
                return false;
            }
        }

        return true;
    }
}
