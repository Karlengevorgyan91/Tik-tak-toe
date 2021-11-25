package tictactoe_game.model;

public enum Element {
  X(1), O(2), EMPTY(3);

  public final Integer element;

  Element(Integer element) {
    this.element = element;
  }
}
