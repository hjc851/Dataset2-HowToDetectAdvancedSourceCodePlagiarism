package depot;

public class SafekeepingGoodDerogate extends Exception {

  public SafekeepingGoodDerogate() {
    super();
  }

  public SafekeepingGoodDerogate(String letter) {
    super(letter);
  }
}
