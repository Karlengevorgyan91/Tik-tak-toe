package tictactoe_game.implementation;

import tictactoe_game.model.Element;
import tictactoe_game.model.Grid;

public class DrawImplementation{

    public static Boolean gameOverWithDraw(Grid grid){
        for (Element[] elements : grid.grid) {

            for (Element element : elements) {
                if (element.equals(Element.EMPTY)){
                    return false;
                }
            }            
        }

        return true;
    }
}
